package com.proteus.preprocess.verilog.generator;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4Parser;
import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4ParserBaseVisitor;

public class StringTerminalNodeVisitor extends ANTLRv4ParserBaseVisitor<String>{
	static List<String> stringLiterals = new ArrayList<String>();
	@Override public String visitTerminal(@NotNull ANTLRv4Parser.TerminalContext ctx) {
		String stringLiteral = null;
			if(ctx.STRING_LITERAL()!=null){
				stringLiteral = ctx.STRING_LITERAL().getText();
				stringLiterals.add(stringLiteral);
		}
		return stringLiteral;
	}
	public static List<String> getStringLiterals(){
		return stringLiterals;
	}
}
