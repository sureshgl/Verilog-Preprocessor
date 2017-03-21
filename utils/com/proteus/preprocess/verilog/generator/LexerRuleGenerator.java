package com.proteus.preprocess.verilog.generator;

import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;

import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4Parser;
import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4ParserBaseVisitor;


public class LexerRuleGenerator extends ANTLRv4ParserBaseVisitor<String>{
	static  HashMap<String,String> mapOfStringsAndLexerTokens = new HashMap<String, String>();
	public static String tokenref;
	@Override public String visitLexerRule(@NotNull ANTLRv4Parser.LexerRuleContext ctx) { 
		if(ctx.TOKEN_REF()!=null && ctx.FRAGMENT()==null){
			tokenref= ctx.TOKEN_REF().getText();
			super.visitLexerRuleBlock(ctx.lexerRuleBlock());
		}
		return null;
	}

	@Override public String visitLexerAtom(@NotNull ANTLRv4Parser.LexerAtomContext ctx) { 
		if(ctx.terminal() !=null){
			if(ctx.terminal().STRING_LITERAL() !=null){
				String stringLiteral = ctx.terminal().STRING_LITERAL().getText();
				mapOfStringsAndLexerTokens.put(stringLiteral, tokenref);
				return stringLiteral;
			}
		}
		return null; 
	}

	public static HashMap<String, String> getListOfExistingLexerTokensMap(){
		return mapOfStringsAndLexerTokens;
	}
}
