package com.proteus.preprocess.verilog.generator;

import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4Parser;
import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4Parser.LabeledAltContext;
import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4Parser.RuleSpecContext;

public class RulesFactory {

	public HashMap<String,ParserRuleContext> getMapOfRules(ANTLRv4Parser.GrammarSpecContext ctx) {
		HashMap<String,ParserRuleContext> tempMapOfRules = new HashMap<String,ParserRuleContext>();
		List<RuleSpecContext> ruleSpecContextList = ctx.rules().ruleSpec();
		for(RuleSpecContext ruleSpecContext : ruleSpecContextList){
			if(ruleSpecContext.parserRuleSpec() != null){
				tempMapOfRules.put(ruleSpecContext.parserRuleSpec().RULE_REF().getText(),ruleSpecContext.parserRuleSpec());
				
				
				if(ruleSpecContext.parserRuleSpec().ruleBlock().ruleAltList().OR(0) != null){
					for(LabeledAltContext labeledAltContext : ruleSpecContext.parserRuleSpec().ruleBlock().ruleAltList().labeledAlt()){
						if(labeledAltContext.POUND() != null){
							tempMapOfRules.put(labeledAltContext.id().getText(),labeledAltContext.alternative());
						}
					}
				}
			}
		}
		return tempMapOfRules;
	}

	public HashMap<String,String> getMapOfTokens(ANTLRv4Parser.GrammarSpecContext ctx) {
		HashMap<String, String> tempMapOfTokens = new HashMap<String,String>();
		List<RuleSpecContext> ruleSpecContextList = ctx.rules().ruleSpec();
		for(RuleSpecContext ruleSpecContext : ruleSpecContextList){
			if(ruleSpecContext.lexerRule() != null){
				LexerRuleVisitor visitor = new LexerRuleVisitor();
				if(visitor.visit(ruleSpecContext.lexerRule()) != null){
					tempMapOfTokens.put(ruleSpecContext.lexerRule().TOKEN_REF().getText(),removeLeadingAndTrailingQuotes(visitor.visit(ruleSpecContext)));
				}
			}
		}
		return tempMapOfTokens;
	}
	
	private String removeLeadingAndTrailingQuotes(String str){
		if(str.charAt(0) == '\'' && str.charAt(str.length()-1) == '\''){
			return str.substring(1, str.length()-1);
		}
		return str;
	}
}
