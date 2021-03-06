#!/usr/bin/env perl

use strict;
use warnings;
use Getopt::Long;
use FindBin qw($Bin);
use FileHandle;
use File::Basename;
use Data::Dumper;
use JSON;
use Cwd;
use Cwd 'realpath';
use IPC::Run3;
use Log::Log4perl qw(:easy);
use Log::Log4perl::Level;

my $opt = {
  'name'         => "",  # cut name
  'sp'           => "",  # starting point, -sp <sp> -sep <cut-core> -ets
  'type'         => "real",
  'enc'          => "",
  'lint'         => 0,   # vcs lint
  'sva'          => 1,   # unroll sva or not 
#  'lec'          => 1,   # lec is On by default
  'pr'           => 0,   # preserve run directory for debug
  'll'           => 'info',
  'help'         => 0,
  'h'            => 0
};


Log::Log4perl->easy_init( { level   => $INFO,
    file    => "STDOUT",
    layout   => '[%.1p]: %m%n'} );
ALWAYS "cmdline: $0 @ARGV\n";
my $rv = GetOptions ($opt,
  'name=s',
  'sp=s',
  'type=s',
  'enc=s',
  'lint!',
  #'lec!',
  'sva!',
  'pr!',
  'll=s',
  'help!',
  'h!'
);

if ( !$rv ||
  !(defined $opt->{'name'})   || ($opt->{'name'} eq '') ||
  $opt->{'h'} ||
  $opt->{'help'}
) {
  print "Usage: $0 -name <cut-name> [-sp <start-module>] [-type real,<beh|func>] [-nosva] [-enc vcs[,ncv]] [-lint] [-pr] [-h|-help]\n";
  print "   This script runs verilogparser on cut_core_<ver>.v to generate\n";
  print "   unrolled verilog and then runs LEC to compare the input\n";
  print "   verilog and unrolled verilog. It needs to be run from\n";
  print "   run_sample directory generated by memogen.\n";
  print "   -name : cut name\n";
  print "   -sp   : start from this module\n";
  print "   -type : real (default), behavioral (beh) or functional (func) to unroll\n";
#  print "   -nolec: do not run LEC (bad idea)\n";
  print "   -enc  : encrypt using any of vcs or ncv\n";
  print "   -lint : run vcs lint checks\n";
  print "   -pr   : to preserve the run directory for debug\n";
  print "   -ll  : log level\n";
  print "   -h    : to print this message\n";
  exit(1);
}
$opt->{'ll'} = uc($opt->{'ll'});
Log::Log4perl->easy_init( { level   => Log::Log4perl::Level::to_priority($opt->{'ll'}),
    file    => "STDOUT",
    layout  => '[%.1p]: %m%n'} );
$opt->{'lec'} = 1;#making lec on by default and removing nolec on command line. will remove once we take proteus to stable state

my $cfg = {};
my $cwd = realpath(getcwd);

my $fi = "$cwd/cutinfo/$opt->{'name'}.json";
$cfg->{'frun'} = read_json ($fi);
my $frun = $cfg->{'frun'};
TRACE Dumper ($cfg->{'frun'});

my $algo;
foreach my $type (split(',',$opt->{'type'})) {
  my $workdir = "$cwd/unroll_$opt->{'name'}_${type}";
  if ($type eq "func") {
    $algo = "common";
  } else {
    $algo = $frun->{'algo'};
  }
  my $cutName = $frun->{'cutName'};
  my $cutCoreName = $frun->{'cutCoreName'};
  my $cutSvaName = $frun->{'cutSVAName'};
  my $pversion = $frun->{'plainVersion'};
  my $noobstr = $frun->{'noob'} ? "true" : "false";
  my $svastr = $frun->{'sva'} ? "true" : "false";
  my $version  = $frun->{'version'};
  my $binPath = $cfg->{'frun'}->{'binaryPath'};
  my $algo_rtl_dir = "$binPath/../verilogparser/ip/$algo/rtl";
  my $verilogparser  = "$binPath/../parsers/scripts/proteus";
  ALWAYS "cut=$cutName cutCore=$cutCoreName algo=$algo noob=$noobstr sva=$svastr version=$version type=$type";
  INFO "verilogparser tool path: $binPath";
  my $filelist = [];
  my $FFilelist = [];
  if ($frun->{'noob'}) {
    ALWAYS "pointing to RTL from IP dir " . realpath ($algo_rtl_dir);
    if (!-e $algo_rtl_dir) {
      LOGDIE "$algo_rtl_dir NOT accessible";
    }
    push @{$FFilelist}," ";
    foreach my $dotf ("rtl.f", "formal.f", "external.f") {
      my $fn = "$algo_rtl_dir/$dotf";
      if(($dotf =~ /^external.f/)&& (-e $fn)){
        $cfg->{'externalFPresent'} = "$algo_rtl_dir/$dotf"; 
      }else{
        push @{$FFilelist},"$algo_rtl_dir/$dotf";
      }
      if (!-e $fn) {
        if ($dotf eq "rtl.f") {
          LOGDIE "$fn NOT accessible";
        } else {
          WARN "$fn NOT accessible";
        }
        next;
      }
    }
  } else {
    my $f = "$binPath/../verilogparser/ip_obfuscated/common/rtl/memoir_design_library_${pversion}.v";
    if (!-e $f) {
      LOGDIE "$f not accessible";
    }
    ALWAYS "pointing to obfuscated RTL $f";
    push @{$filelist}, $f;
  }
  my $cut_type = $type eq "real" ? "" : "_" . $type;
  my $cut_name = "${cutName}${cut_type}";
  my $cut_core_name = "${cutCoreName}${cut_type}";
  my $cut_sva_name = "${cutSvaName}${cut_type}";
  my $cut_src = "$cwd/../rtl/${cut_name}.v";
  my $cut_dst = "$cwd/../rtl_unrolled/${cut_name}.v";
  my $cut_core_src = "$cwd/../rtl/${cut_core_name}.v";
  my $cut_core_unrolled = "$cwd/../rtl_unrolled/${cut_core_name}.v";
  my $cut_sva_src = "$cwd/../rtl/${cut_sva_name}.v";
  my $cut_sva_unrolled = "$cwd/../rtl_unrolled/${cut_sva_name}.v";
  push @{$filelist}, $cut_core_src;
  if ($frun->{'sva'} && $opt->{'sva'}) { # sva file
    push @{$filelist}, $cut_sva_src;
  }

  if (!-e $verilogparser) {
    LOGDIE "$verilogparser not accessible";
  }
  if (!-e $cut_src) {
    LOGDIE "$cut_src not accessible";
  }
  if (!-e $cut_core_src) {
    LOGDIE "$cut_core_src not accessible";
  }

  my $cmd = "";

  $cmd = "\\rm -fr $workdir";
  vsystem($cmd);

  $cmd = "\\mkdir -p $workdir";
  vsystem($cmd);

  vchdir($workdir);

  $cmd = "\\mkdir -p $cwd/../rtl_unrolled";
  vsystem($cmd);

  $cmd = "\\rm -f $cut_dst";
  vsystem($cmd);

  $cmd = "\\rm -f $cut_core_unrolled";
  vsystem($cmd);

  $cmd = "\\cp -p $cut_src $cut_dst";
  vsystem($cmd);

  my $df = join(" ", @{$filelist});
  my $dFF = join(" -F ", @{$FFilelist});
  $cmd = "$verilogparser -o $cut_core_unrolled -t $cut_core_name $df $dFF";
  vsystem("$cmd 2>&1 > vp.core.log");

  my $vjh = read_json("${cut_core_name}.json");
  TRACE Dumper ($vjh);
  my $verilog_files = {};
  $verilog_files->{'toEncrypt'} = [];
  $verilog_files->{'unrollCompile'} = [];
  $verilog_files->{'encryptCompile'} = [];
  $verilog_files->{'cpToEncDir'} = [];
  if ($opt->{'sp'}) {
    foreach my $vf (@{$vjh->{'extraOutputFiles'}}) {
      if (basename($vf) ne "${cut_core_name}.v") {
        push @{$verilog_files->{'toEncrypt'}}, $vf;
      } else {
        push @{$verilog_files->{'cpToEncDir'}}, $vf;
      }
      push @{$verilog_files->{'unrollCompile'}}, $vf;
    }
    push @{$verilog_files->{'unrollCompile'}}, $vjh->{'outputFile'};
    push @{$verilog_files->{'cpToEncDir'}}, $vjh->{'outputFile'};
  } else {
    push @{$verilog_files->{'toEncrypt'}}, $cut_core_unrolled;
    push @{$verilog_files->{'unrollCompile'}}, $cut_core_unrolled;
  }


  TRACE Dumper ($verilog_files);

  if (0) {
    $cmd = "\\vcs -q +vcs+lic+wait -sverilog +libext+.v +libext+.sv ";
    $cmd .= $opt->{'lint'} ? " +lint=all" : "";
  } else {
    $cmd = "\\ncverilog -sysv_ext .sv -sysv_ext .v +sv ";
  }
  if(-e $cfg->{'externalFPresent'}){
    $cmd .= " @{$verilog_files->{'unrollCompile'}} -F $cfg->{'externalFPresent'}"; 
  }else{
    $cmd .= " @{$verilog_files->{'unrollCompile'}}"; 
  }
  vsystem($cmd);

  if (!-e $cut_core_unrolled) {
    LOGDIE "$cut_core_unrolled not accessible";
  }

  my $cut_core_lec_dofile = $vjh->{'lecFile'};
  if (!-e $cut_core_lec_dofile) {
    LOGDIE "$cut_core_lec_dofile not accessible";
  }

  if ($opt->{'lec'} && $type ne "func") {
    $cmd = "lec -64 -NOBanner -NOGui -xl -Dofile $cut_core_lec_dofile";
    vsystem($cmd);
  } else {
    WARN ">> skipping LEC comparison <<";
  }

  if (!-e $cut_dst) {
    LOGDIE "$cut_dst not accessible";
  }

  vchdir($cwd);

  if ($opt->{'pr'} != 1) {
    $cmd = "\\rm -fr $workdir";
    vsystem($cmd);
  }

  if ($frun->{'sva'} && $opt->{'sva'}) { # sva file
    $workdir = "$workdir.b";
    my $cut_sva_lec_dofile = "$workdir/${cut_sva_name}.dofile";

    $cmd = "\\rm -fr $workdir";
    vsystem($cmd);

    $cmd = "\\mkdir -p $workdir";
    vsystem($cmd);

    vchdir($workdir);

    $cmd = "\\rm -f $cut_sva_unrolled";
    vsystem($cmd);

    my $df = join(" ", @{$filelist});
    $cmd = "$verilogparser -o $cut_sva_unrolled -t $cut_sva_name $df 2>&1 > vp.sva.log";
    vsystem($cmd);

    push @{$verilog_files->{'unrollCompile'}}, $cut_sva_unrolled;
    push @{$verilog_files->{'cpToEncDir'}}, $cut_sva_unrolled; 

    if (0) {
      $cmd = "\\vcs -q +vcs+lic+wait -sverilog +libext+.v +libext+.sv ";
      $cmd .= $opt->{'lint'} ? " +lint=all" : "";
    } else {
      $cmd = "\\ncverilog -sysv_ext .sv -sysv_ext .v +sv ";
    }
    if(-e $cfg->{'externalFPresent'}){
      $cmd .= " @{$verilog_files->{'unrollCompile'}} -F $cfg->{'externalFPresent'}"; 
    }else{
      $cmd .= " @{$verilog_files->{'unrollCompile'}}"; 
    }
    vsystem($cmd);

    if (!-e $cut_sva_unrolled) {
      LOGDIE "$cut_sva_unrolled not accessible";
    }
    if (!-e $cut_sva_lec_dofile) {
      LOGDIE "$cut_sva_lec_dofile not accessible";
    }

    vchdir($cwd);

    if ($opt->{'pr'} != 1) {
      $cmd = "\\rm -fr $workdir";
      vsystem($cmd);
    }
  } else {
    WARN "not unrolling SVA ...";
  }


  if ($opt->{'enc'} eq "") {
    INFO "skipping encryption ...";
  } else {
    foreach my $et (split(',', $opt->{'enc'})) {

      my $enctd  = "rtl_encrypted.${et}";
      my $encdir = "$cwd/../$enctd";

      $cmd = "\\mkdir -p $encdir";
      vsystem($cmd);

      $cmd = "\\cp -p $cut_src $encdir";
      vsystem($cmd);

      foreach my $uf (@{$verilog_files->{'cpToEncDir'}}) {
        my $ef = $uf;
        $ef =~ s/rtl_unrolled/${enctd}/g;
        $cmd = "\\cp -p $uf $ef"; 
        vsystem($cmd);
        push @{$verilog_files->{'encryptCompile'}}, $ef; 
      }

      if ($et eq "vcs") {
        foreach my $uf (@{$verilog_files->{'toEncrypt'}}) {
          my $ef = $uf;
          $ef =~ s/rtl_unrolled/${enctd}/g;
          $cmd = "\\synenc -f verilog -o $ef $uf";
          vsystem($cmd);
          push @{$verilog_files->{'encryptCompile'}}, $ef; 
        }

        $cmd = "\\vcs -q +vcs+lic+wait -sverilog @{$verilog_files->{'encryptCompile'}}"; 
        vsystem($cmd);
      } elsif ($et eq "ncv") {
        foreach my $uf (@{$verilog_files->{'toEncrypt'}}) {
          my $ef = $uf;
          $ef =~ s/rtl_unrolled/${enctd}/g;
          my $fn = basename($ef);
          $cmd = "ncprotect -language vlog -autoprotect -overwrite -ifileprotect -synthesis output_netlist:cleartext -synthesis viewers:none -simulation none -OUTDIR $encdir -OUTNAME $fn -OVERWRITE $uf";
          vsystem($cmd);
          push @{$verilog_files->{'encryptCompile'}}, $ef; 
        }
        if(-e $cfg->{'externalFPresent'}){
          $cmd = "ncverilog -C -q -nocopyright +sv +define+NCV_SIMULATOR -licqueue -64bit -nonotifier -sv @{$verilog_files->{'encryptCompile'}} -F $cfg->{'externalFPresent'}";        
        }else{
          $cmd = "ncverilog -C -q -nocopyright +sv +define+NCV_SIMULATOR -licqueue -64bit -nonotifier -sv @{$verilog_files->{'encryptCompile'}}"; 
        }
        vsystem($cmd);
      } else {
        LOGDIE "encryption mode $opt->{'enc'} not supported";
      }
    }
  }
}
ALWAYS "all done";

sub vsystem {
  my $cmd = shift;

  INFO "* $cmd\n";

  my $rv = run3 ($cmd, undef, undef, undef, {'return_if_system_error' => 1});

  my $es   = $?;
  my $en   = $!;
  my $estr = $@;

  if ($rv != 1) {
    LOGDIE "$cmd failed\n";
  }
  if ($es) {
    LOGDIE "$cmd exited with non-zero status : $es : $en : $estr\n";
  }
}

sub vchdir {
  my $dir = shift;
  LOGDIE "Too many args" if defined shift;

  INFO "* cd $dir";
  chdir ($dir) or LOGDIE "cd $dir failed\n";
}
sub read_json {
  my $fi = shift; 
  ALWAYS "reading $fi";
  my $fh = FileHandle->new( $fi, "r" );
  if ( !defined $fh ) {
    LOGDIE "failed to open $fi for read - regenerate cut if needed\n";
  }
  my @js = <$fh>;
  my $s = join( "\n", @js );
  $fh->close();
  my $jh = decode_json($s);
  return $jh;
}


