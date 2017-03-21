package com.proteus.preprocess.verilog.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import com.proteus.common.util.FileUtils;
import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4Lexer;
import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4Parser;

public class SingletonVerilogParserHashMap {

	public static volatile HashMap<String,ParserRuleContext> mapOfRules;
	public static volatile HashMap<String,String> mapOfTokens;
	public static volatile List<String> listOfExistingTestCaseData;


	public static void init(File verilogFile) throws FileNotFoundException,IOException{
		if(mapOfTokens == null && mapOfRules == null) {
			synchronized (SingletonVerilogParserHashMap.class) {
				InputStream inputStream =new FileInputStream(verilogFile);
				ANTLRv4Lexer lexer = new ANTLRv4Lexer(new ANTLRInputStream(inputStream));
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				ANTLRv4Parser parser = new ANTLRv4Parser(tokens);
				ANTLRv4Parser.GrammarSpecContext tree = parser.grammarSpec();
				RulesFactory rulesFactory = new RulesFactory();
				mapOfRules = rulesFactory.getMapOfRules(tree);
				mapOfTokens = rulesFactory.getMapOfTokens(tree);
				mapOfTokens.put("EOF", ""); // for handling EOF
			}
		}
	}


	protected SingletonVerilogParserHashMap(){

	}

	public static HashMap<String, ParserRuleContext> getMapOfRules(File verilogFile) throws FileNotFoundException, IOException{
		init(verilogFile);
		return mapOfRules;
	}

	public static HashMap<String, String> getMapOfTokens(File VerilogFile) throws FileNotFoundException, IOException{
		init(VerilogFile);
		return mapOfTokens;
	}

	public static List<String> getListOfExistingTestCaseData() throws URISyntaxException{
		if(listOfExistingTestCaseData == null){
			synchronized (SingletonVerilogParserHashMap.class) {
				if(listOfExistingTestCaseData == null){
					URL url = SingletonVerilogParserHashMap.class.getResource("/com.proteus.preprocess/verilog/util/TestCasesWithData.list");
					URI	uri = url.toURI();
					File file = new File(uri);
					listOfExistingTestCaseData = FileUtils.ReadLines(file);
					return listOfExistingTestCaseData;
				}	
			}
		}
		return listOfExistingTestCaseData;
	}

}
