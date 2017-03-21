package com.proteus.preprocess.verilog.generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import com.proteus.common.util.FileUtils;
import com.proteus.preprocess.antlr4.Antlr4Reflection;
import com.proteus.preprocess.antlr4.Antlr4Reflection.RuleAlt;
import com.proteus.preprocess.antlr4.Antlr4Reflection.RuleNormal;
import com.proteus.preprocess.antlr4.Antlr4Reflection.RuleType;

public class TestCaseGenerator {

	private static void generateTestClasses(Map<String, RuleType> rules) throws FileNotFoundException {
		STGroupFile stgf = new STGroupFile("test/com.proteus.preprocess.verilog/generator/testcase.stg");
		Set<String> altRules = new LinkedHashSet<>();
		for(Entry<String, RuleType> e:rules.entrySet()){
			if(e.getValue().isAlt()){
				RuleAlt r = (RuleAlt) e.getValue();
				altRules.add(r.getParentRule().getRuleName());
			}
		}
		for(String s:altRules){
			ST stAlt = stgf.getInstanceOf("testaltnodeskel");
			String classname = toCamelCase(s);
			stAlt.add("classname",classname);
			stAlt.add("rule",s);
			FileUtils.WriteFile(new File("test/com.proteus.preprocess.verilog/"+classname+"Test.java"), stAlt.render());

			rules.remove(s);
		}
		
		int count = 0;
		
		List<String> terminals = new ArrayList<String>();
		terminals = getDataFromFile("cfg/com.proteus.preprocess.verilog/util/TestCasesWithData.list");

		for(Entry<String, RuleType> e:rules.entrySet()){
			if(e.getValue().isAlt()){
				RuleAlt r = (RuleAlt) e.getValue();
				ST st = stgf.getInstanceOf("testaltskel");
				String classname = toCamelCase(r.getAltName());
				st.add("classname", classname);
				st.add("ruletext", r.getAltText());
				st.add("rule",r.getAltName());
				st.add("parent_rule",r.getParentRule().getRuleName());
				st.add("parent_classname", toCamelCase(r.getParentRule().getRuleName()));
				count++;
				FileUtils.WriteFile(new File("test/com.proteus.preprocess.verilog/"+classname+"Test.java"), st.render());
			}else{
				RuleNormal r = (RuleNormal) e.getValue();

				if(terminals.contains(r.getRuleName())){
					ST st = stgf.getInstanceOf("TestParserTermSkel");
					String classname = toCamelCase(r.getRuleName());
					st.add("classname", classname);
					st.add("ruletext", r.getRuleBody());
					st.add("rule",r.getRuleName());
					count++;
					FileUtils.WriteFile(new File("test/com.proteus.preprocess.verilog/"+classname+"Test.java"), st.render());
				} else{
					ST st = stgf.getInstanceOf("testskel");
					String classname = toCamelCase(r.getRuleName());
					String testDataFile = classname+"TestData";
					st.add("classname", classname);
					st.add("ruletext", r.getRuleBody());
					st.add("rule",r.getRuleName());

					String rule = r.getRuleBody();
					String[] parts = rule.split(":");
					String[] rules1 = parts[1].trim().split(" ");
					if(rules1[0].matches("(.*);") || rules1[0].matches("(.*)\\s*;")) {
						ST stSingle = stgf.getInstanceOf("testsingleskel");
						stSingle.add("classname", classname);
						stSingle.add("ruletext", r.getRuleBody());
						stSingle.add("rule", r.getRuleName());
						String ruleName = rules1[0].replaceAll(";","");
						if (!ruleName.contains("|")) {	
							String testClass = ruleName+"Test";
							String ruleClass = toCamelCase(ruleName)+"Test";
							stSingle.add("ruleclass", ruleClass);
							stSingle.add("testclass",testClass);
							count++;
							FileUtils.WriteFile(new File("test/com.proteus.preprocess.verilog/"+classname+"Test.java"), stSingle.render());
						} else {
							st.add("testDataFile",testDataFile);
							count++;
							FileUtils.WriteFile(new File("test/com.proteus.preprocess.verilog/"+classname+"Test.java"), st.render());

						}
					} else {

					st.add("testDataFile",testDataFile);
					count++;
					FileUtils.WriteFile(new File("test/com.proteus.preprocess.verilog/"+classname+"Test.java"), st.render());
					}

				}
			}
		}
		
		System.out.println("Generated "+ count + " Test classes");
	}


	public static void main(String[] args) throws IOException {
		generateTestClasses(Antlr4Reflection.getParserRules("grammar/Verilog.g4"));
	}

	private static String toCamelCase(String input){
		StringBuilder sb = new StringBuilder();
		String[] parts = input.split("_");
		for(String part:parts){
			sb.append(part.substring(0, 1).toUpperCase());
			sb.append(part.substring(1));
		}
		return sb.toString();
	}

	private static String RemoveTabSpaceNewLine(String input) {
		input = input.replaceAll("\t", "");  
		input = input.replaceAll("\n", "");  
		input = input.replaceAll(" ", "");
		return input;
	}

	private static List<String> getDataFromFile(String fileName){
		File file = new File(fileName);
		List<String> value = new ArrayList<String>();
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		try {
			while ((line = bufferedReader.readLine()) != null) {
				line = RemoveTabSpaceNewLine(line);

				value.add(line);
			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	

}
