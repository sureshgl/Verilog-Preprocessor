package com.proteus.preprocess.verilog.generator;

import org.antlr.v4.runtime.misc.NotNull;

import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4Parser;
import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4ParserBaseVisitor;

public class LexerRuleVisitor extends ANTLRv4ParserBaseVisitor<String>{
	
	@Override public String visitLexerRule(@NotNull ANTLRv4Parser.LexerRuleContext ctx) { 
		return visitLexerRuleBlock(ctx.lexerRuleBlock());
	}

	@Override public String visitLexerRuleBlock(@NotNull ANTLRv4Parser.LexerRuleBlockContext ctx) { 
		return visitLexerAltList(ctx.lexerAltList());
	}

	@Override public String visitLexerAltList(@NotNull ANTLRv4Parser.LexerAltListContext ctx) { 
		if(ctx.lexerAlt().size() > 1){		//Skipping multi-value lexical rules, needs to be handled - Krishna
			return null;
		}
		return visitLexerAlt(ctx.lexerAlt(0));
	}
	
	@Override public String visitLexerAlt(@NotNull ANTLRv4Parser.LexerAltContext ctx) { 
		return visitLexerElements(ctx.lexerElements());
	}

	@Override public String visitLexerElements(@NotNull ANTLRv4Parser.LexerElementsContext ctx) { 
		if(ctx.lexerElement().size() > 1){		//Skipping multi-value lexical rules, needs to be handled - Krishna
			return null;
		}
		return visitLexerElement(ctx.lexerElement(0)); 
	}

	@Override public String visitLexerElement(@NotNull ANTLRv4Parser.LexerElementContext ctx) { 
		if(ctx.lexerAtom() != null){
			return visitLexerAtom(ctx.lexerAtom());
		}
			return null;
	}
	
	@Override public String visitLexerAtom(ANTLRv4Parser.LexerAtomContext ctx) {
		if(ctx.terminal() != null){
			return visitTerminal(ctx.terminal());
		}
		return null;
	}
	
	@Override public String visitTerminal(ANTLRv4Parser.TerminalContext ctx) {
	if(ctx.STRING_LITERAL() != null){
			return ctx.STRING_LITERAL().getText();
		}
		return null;
	}
}

