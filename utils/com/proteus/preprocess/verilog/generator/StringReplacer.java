package com.proteus.preprocess.verilog.generator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.NotNull;

import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4Parser;
import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4ParserBaseVisitor;

public class StringReplacer extends ANTLRv4ParserBaseVisitor<String>{
	Properties properties;
	BufferedWriter bw, bwparser,bwlexer;
	public StringReplacer(FileOutputStream fos, Properties props) throws IOException {
		bw = new BufferedWriter(new OutputStreamWriter(fos));
		//bw.write("grammar Verilog;"+ "\n");
		properties = props;
		bwparser = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(".parser.txt"))));
		bwlexer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(".lexer.txt"))));
	}

	@Override public String visitParserRuleSpec(@NotNull ANTLRv4Parser.ParserRuleSpecContext ctx) {
		int a = ctx.start.getStartIndex();
		int b = ctx.stop.getStopIndex();
		Interval interval = new Interval(a,b);
		String newText = ctx.start.getInputStream().getText(interval);
		Pattern p = Pattern.compile("(?<!\\\\)'((?:\\\\'|[^'])*)(?<!\\\\)'");
		Matcher m = p.matcher(newText);
		while (m.find()) {
			String lexerRuleinput = m.group(1);
			String lexerRuleInputWithQuotes = "'"+lexerRuleinput+"'";
			if(properties.containsKey(lexerRuleinput)){
				String lexerReplacedRule = (String) properties.get(lexerRuleinput);
				newText = newText.replace(lexerRuleInputWithQuotes, " "+lexerReplacedRule+" ");
			}
		}
		try {
			bwparser.write(newText+ "\n\n");
			bwparser.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override public String visitGrammarType(@NotNull ANTLRv4Parser.GrammarTypeContext ctx) { 
		try {
			bw.append(ctx.getText()+" ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null; 
	}

	@Override public String visitPrequelConstruct(@NotNull ANTLRv4Parser.PrequelConstructContext ctx) { 
		try {
			bw.append(ctx.getText()+"\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null; 
	}

	@Override public String visitId(@NotNull ANTLRv4Parser.IdContext ctx) { 
		try {
			bw.append(ctx.getText()+";\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null; 
	}
	
	@Override public String visitLexerRule(@NotNull ANTLRv4Parser.LexerRuleContext ctx) { 

		int a = ctx.start.getStartIndex();
		int b = ctx.stop.getStopIndex();
		Interval interval = new Interval(a,b);
		String newText = ctx.start.getInputStream().getText(interval);
		try {
			bwlexer.write(newText+ "\n\n");
			bwlexer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void writeLerxerRule(HashMap<String, String> stringTokenRefsNotFoundInLexer) {
		for(String lexerRule : stringTokenRefsNotFoundInLexer.keySet()){
			String lexerRuleWithoutQuotes = lexerRule.substring(1, lexerRule.length()-1);
			if(properties.containsKey(lexerRuleWithoutQuotes)){
				String newText = properties.get(lexerRuleWithoutQuotes)+" : "+ lexerRule+";";
				//System.out.println(newText);
				try {
					bwparser.write(newText+ "\n");
					bwparser.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void writeToFile() throws IOException{
		String line = null;
		BufferedReader bufferedReader ,bufferedReader1;
		try {
			bufferedReader = new BufferedReader(new FileReader(".parser.txt"));
			bufferedReader1 = new BufferedReader(new FileReader(".lexer.txt"));

			try {
				while((line = bufferedReader.readLine()) != null) {
					bw.write(line+"\n");
				}
				while((line = bufferedReader1.readLine()) != null) {
					bw.write(line+"\n");
				}
				bufferedReader.close(); 
				bw.close();


			} catch (IOException e) {
				e.printStackTrace();
			}    
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + "parser.txt" + "'");
		}
	}
}
