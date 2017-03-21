//define rule shud end with newline
module xyz;
******************
shouldnot process this xyz
endmodule

module define_rule_testdata;
`define AQM_AFDWIRELESSRADIOPOLICERSTATS_FRAMECNT_LSB 20
`define F(x) x+1
`define G(x) x+2
`define _FILE_VH 1
`define OR(x,y) xvg@#|y
`define BSV_DEFINED(d)  `ifdef _FILE_VH d `else 0 `endif
`define D(x) `F(x)+`G(x)
`define AQM_REPPORTQOSTABLE_AQMREPPORTQOSTABLEWORD2_REG_ADDR   32'h0076f020
`define MY_NUMBER 5
abc abc ;
xyz xyz ;
`define MY_STRING "Hello world!"
`define ADD2PLUS2 2 + 2
`define ADD5(RESULT, SOURCE) \
  RESULT = SOURCE + 5; \
  `MY_NUMBER \
  $display("Inside ADD5 macro. Scope is %m");

`ADD5(result,5)
`ADD2PLUS2
`MY_STRING
`AQM_AFDWIRELESSRADIOPOLICERSTATS_FRAMECNT_LSB
`_FILE_VH
`OR(1,1)
`BSV_DEFINED(1)
`D(2)
`AQM_REPPORTQOSTABLE_AQMREPPORTQOSTABLEWORD2_REG_ADDR
`MY_NUMBER
endmodule

module abc;
******************
shouldnot process this
endmodule