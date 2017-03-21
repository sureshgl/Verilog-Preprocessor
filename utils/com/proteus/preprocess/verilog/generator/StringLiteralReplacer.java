package com.proteus.preprocess.verilog.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4Lexer;
import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4Parser;


public class StringLiteralReplacer {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		StringTerminalNodeVisitor stringTerminalNodeVisitor = new StringTerminalNodeVisitor();	
		String grammarFile = args[0] ; // input grammar file in which string literals to be replaced
		File file = new File(grammarFile);
		InputStream inputStream =new FileInputStream(file);
		ANTLRv4Lexer lexer = new ANTLRv4Lexer(new ANTLRInputStream(inputStream));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ANTLRv4Parser parser = new ANTLRv4Parser(tokens);
		ANTLRv4Parser.GrammarSpecContext tree = parser.grammarSpec();
		stringTerminalNodeVisitor.visit(tree);

		LexerRuleGenerator lexerRuleGenerator = new LexerRuleGenerator();
		lexerRuleGenerator.visit(tree);
		
		HashMap<String,String> mapOfNewStringsAndLexerTokens = new HashMap<String, String>();
		HashMap<String,String> stringTokenRefsNotFoundInLexer = new HashMap<String, String>();

		for(String stringLiteral : stringTerminalNodeVisitor.getStringLiterals()){
			String stringLiteralValue = null;
			if(stringLiteral.charAt(0) == '\'' && stringLiteral.charAt(stringLiteral.length()-1) == '\''){
				stringLiteralValue = stringLiteral.substring(1, stringLiteral.length()-1);
			}

			if(lexerRuleGenerator.getListOfExistingLexerTokensMap().containsKey(stringLiteral)){
				mapOfNewStringsAndLexerTokens.put(stringLiteralValue,lexerRuleGenerator.getListOfExistingLexerTokensMap().get(stringLiteral) );
			}else{
				stringTokenRefsNotFoundInLexer.put(stringLiteral, null);
				if (stringLiteralValue.matches("[a-zA-Z0-9]+") && !stringLiteralValue.contains("$")){
					mapOfNewStringsAndLexerTokens.put(stringLiteralValue, stringLiteralValue.toUpperCase()+"STR");
				}else {
					mapOfNewStringsAndLexerTokens.put(stringLiteralValue, null);
				}
			}
		}
		
		for(String str : stringTokenRefsNotFoundInLexer.keySet()){
			System.out.println(str+" and value is "+stringTokenRefsNotFoundInLexer.get(str));
		}
		Properties props = new Properties();
		InputStream in = StringLiteralReplacer.class.getResourceAsStream("./AllLexerNamesList.txt");
		try {
			props.load(in);
		} catch (IOException e) {
			throw new RuntimeException("Properties could not be loaded.");
		}

		File fout = new File("newVerilog.txt");
		FileOutputStream fos = new FileOutputStream(fout);
		StringReplacer stringReplacer = new StringReplacer(fos,props);
		stringReplacer.visit(tree);
		
		stringReplacer.writeLerxerRule(stringTokenRefsNotFoundInLexer);
		stringReplacer.writeToFile();
	}
}
