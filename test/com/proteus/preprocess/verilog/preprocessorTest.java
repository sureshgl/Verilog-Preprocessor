package com.proteus.preprocess.verilog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.proteus.common.util.Utils;
import com.proteus.preprocess.pp.ext.Macro;
import com.proteus.preprocess.pp.ext.MacroKey;
import com.proteus.preprocess.pp.gen.PPParser.StartContext;
import com.proteus.preprocess.runner.PreprocessRunnerSession;
import com.proteus.preprocess.runner.util.ModuleIndexer;

public class preprocessorTest {

	@Test
	public void test_define() throws IOException{
		File outputDir = new File("preprocess");
		List<File> forIndexing = new ArrayList<File>();
		forIndexing.add(new File("test/com.proteus.preprocess/verilog/test_data/define_rule_testData.v"));
		ModuleIndexer mi = index(forIndexing);
		HashMap<String, String> macros = new HashMap<String, String>();
		macros.put("from_cmd_line", "from_cmd_line");
		macros.put("second_from_cmd_line", "second_from_cmd_line");
		HashMap<MacroKey,Macro> macroMap = getMacroDefinitions(macros);
		HashMap<File,Boolean> filePreprocessStatusMap = new HashMap<File, Boolean>();
		PreprocessRunnerSession proteusRunnerSession = new PreprocessRunnerSession(outputDir,forIndexing,null, macroMap, null,mi,filePreprocessStatusMap, null);
		StartContext stc = proteusRunnerSession.preprocess();
		File expectedResultFile = new File("test/com.proteus.preprocess/verilog/test_data/define_rule_testResult.v");
		String expectedResult = readFile(expectedResultFile);
		Assert.assertTrue(stc.extendedContext.getFormattedText().trim().equals(expectedResult));
	}

	
	@Test
	public void test_ifdef() throws IOException{
		File outputDir = new File("preprocess");
		List<File> forIndexing = new ArrayList<File>();
		forIndexing.add(new File("test/com.proteus.preprocess/verilog/test_data/ifdef_elseif_else_end_testData.v"));
		ModuleIndexer mi = index(forIndexing);
		HashMap<String, String> macros = new HashMap<String, String>();
		HashMap<MacroKey,Macro> macroMap = getMacroDefinitions(macros);
		HashMap<File,Boolean> filePreprocessStatusMap = new HashMap<File, Boolean>();
		PreprocessRunnerSession proteusRunnerSession = new PreprocessRunnerSession(outputDir,forIndexing,null, macroMap, null,mi,filePreprocessStatusMap, null);
		StartContext stc = proteusRunnerSession.preprocess();

		File expectedResultFile = new File("test/com.proteus.preprocess/verilog/test_data/ifdef_elseif_else_endtestResult.v");
		String expectedResult = readFile(expectedResultFile);
		Assert.assertTrue(stc.extendedContext.getFormattedText().equals(expectedResult));
	}

	@Test
	public void test_reset_all() throws IOException{
		File outputDir = new File("preprocess");
		List<File> forIndexing = new ArrayList<File>();
		forIndexing.add(new File("test/com.proteus.preprocess/verilog/test_data/reset_all_testData.v"));
		ModuleIndexer mi = index(forIndexing);
		HashMap<String, String> macros = new HashMap<String, String>();
		HashMap<MacroKey,Macro> macroMap = getMacroDefinitions(macros);
		HashMap<File,Boolean> filePreprocessStatusMap = new HashMap<File, Boolean>();
		PreprocessRunnerSession proteusRunnerSession = new PreprocessRunnerSession(outputDir,forIndexing,null, macroMap, null,mi,filePreprocessStatusMap, null);
		StartContext stc = proteusRunnerSession.preprocess();

		Assert.assertTrue(proteusRunnerSession.getMacroMap().size()==0);
		File expectedResultFile = new File("test/com.proteus.preprocess/verilog/test_data/reset_alltestResult.v");
		String expectedResult = readFile(expectedResultFile);
		Assert.assertTrue(stc.extendedContext.getFormattedText().trim().equals(expectedResult));
	}


	@Test
	public void test_undef() throws IOException{
		File outputDir = new File("preprocess");
		List<File> forIndexing = new ArrayList<File>();
		forIndexing.add(new File("test/com.proteus.preprocess/verilog/test_data/undef_testData.v"));
		ModuleIndexer mi = index(forIndexing);
		HashMap<String, String> macros = new HashMap<String, String>();
		HashMap<MacroKey,Macro> macroMap = getMacroDefinitions(macros);
		HashMap<File,Boolean> filePreprocessStatusMap = new HashMap<File, Boolean>();
		PreprocessRunnerSession proteusRunnerSession = new PreprocessRunnerSession(outputDir,forIndexing,null, macroMap, null,mi, filePreprocessStatusMap,null);
		StartContext stc = proteusRunnerSession.preprocess();

		Assert.assertTrue(proteusRunnerSession.getMacroMap().size()==1);
		File expectedResultFile = new File("test/com.proteus.preprocess/verilog/test_data/undef_testResult.v");
		String expectedResult = readFile(expectedResultFile);
		Assert.assertTrue(stc.extendedContext.getFormattedText().trim().equals(expectedResult));
	}

	@Test
	public void test_timescale() throws IOException{
		File outputDir = new File("preprocess");
		List<File> forIndexing = new ArrayList<File>();
		forIndexing.add(new File("test/com.proteus.preprocess/verilog/test_data/timescale_testData.v"));
		ModuleIndexer mi = index(forIndexing);
		HashMap<String, String> macros = new HashMap<String, String>();
		HashMap<MacroKey,Macro> macroMap = getMacroDefinitions(macros);
		HashMap<File,Boolean> filePreprocessStatusMap = new HashMap<File, Boolean>();
		PreprocessRunnerSession proteusRunnerSession = new PreprocessRunnerSession(outputDir,forIndexing,null, macroMap, null,mi, filePreprocessStatusMap,null);
		StartContext stc = proteusRunnerSession.preprocess();

		File expectedResultFile = new File("test/com.proteus.preprocess/verilog/test_data/timescale_testResult.v");
		String expectedResult = readFile(expectedResultFile);
		Assert.assertTrue(stc.extendedContext.getFormattedText().trim().equals(expectedResult));
	}

	@Test
	public void test_include_rule() throws IOException{
		File outputDir = new File("preprocess");
		List<File> forIndexing = new ArrayList<File>();
		forIndexing.add(new File("test/com.proteus.preprocess/verilog/test_data/include_rule_testData.v"));
		ModuleIndexer mi = index(forIndexing);
		HashMap<String, String> macros = new HashMap<String, String>();
		HashMap<MacroKey,Macro> macroMap = getMacroDefinitions(macros);
		HashMap<File,Boolean> filePreprocessStatusMap = new HashMap<File, Boolean>();
		PreprocessRunnerSession proteusRunnerSession = new PreprocessRunnerSession(outputDir,forIndexing,null, macroMap, null,mi, filePreprocessStatusMap,null);
		StartContext stc = proteusRunnerSession.preprocess();

		File expectedResultFile = new File("test/com.proteus.preprocess/verilog/test_data/include_rule_testResult.v");
		String expectedResult = readFile(expectedResultFile);
		Assert.assertTrue(stc.extendedContext.getFormattedText().equals(expectedResult));
	}


	@Test
	public void test_module_instantiation() throws IOException{
		File outputDir = new File("preprocess");
		List<File> forIndexing = new ArrayList<File>();
		forIndexing.add(new File("test/com.proteus.preprocess/verilog/test_data/instantiation_testData.v"));
		forIndexing.add(new File("test/com.proteus.preprocess/verilog/test_data/instantiation_part2.v"));
		ModuleIndexer mi = index(forIndexing);
		HashMap<String, String> macros = new HashMap<String, String>();
		HashMap<MacroKey,Macro> macroMap = getMacroDefinitions(macros);
		HashMap<File,Boolean> filePreprocessStatusMap = new HashMap<File, Boolean>();
		List<String> yOptionFiles = new ArrayList<String>();
		yOptionFiles.add("search_path");
		PreprocessRunnerSession proteusRunnerSession = new PreprocessRunnerSession(outputDir,forIndexing,yOptionFiles, macroMap, null,mi,filePreprocessStatusMap, null);
		StartContext stc = proteusRunnerSession.preprocess();
	}

	public static String readFile(File file) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line!= null) {

				sb.append(line+"\n");
				line = br.readLine();
			}
			return sb.toString().trim();
		} finally {
			br.close();
		}
	}

	public static HashMap<MacroKey,Macro> getMacroDefinitions(Map<String,String> macroMap)
	{
		HashMap<MacroKey,Macro> macromap = new HashMap<MacroKey, Macro>();
		for(String macroid : macroMap.keySet()){
			Macro macro = new Macro();
			MacroKey macrokey = new MacroKey();
			macrokey.setMacroName(macroid);
			macrokey.setNoOfParameters(0);
			macro.setMacroName(macroid);
			macro.setListOfParameters(null);
			macro.setMacroKey(macrokey);
			macro.setMacroDef(macroMap.get(macroid));
			macromap.put(macrokey, macro);
		}
		return macromap;
	}

	private static ModuleIndexer index(List<File> forIndexing){
		List<File> allInputPreprocessedFiles = Utils.newArrList(); 
		for(File inputfile:forIndexing){
			allInputPreprocessedFiles.add(inputfile);
		}
		return new ModuleIndexer(allInputPreprocessedFiles);
	}
	

}

