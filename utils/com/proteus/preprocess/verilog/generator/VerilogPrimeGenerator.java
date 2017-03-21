package com.proteus.preprocess.verilog.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;

import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4Lexer;
import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4Parser;
import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4Parser.RuleSpecContext;
import com.proteus.preprocess.ANTLRv4.gen.ANTLRv4ParserBaseVisitor;
/*
 * Its a ANTLRv4 visitor which takes two input parameters, first is the path of the input grammar file and the second is the path for the output grammar file.
 * It parses the grammar file and prints it as it is with some additions to the grammar file.
 * 
 * In this class, we are adding locals[ ] and @init + @after code for each and every rule.
 */
public class VerilogPrimeGenerator extends ANTLRv4ParserBaseVisitor<String>{

	public static void main(String args[]){
		VerilogPrimeGenerator verilogPrimeGenerator = new VerilogPrimeGenerator();
//		verilogPrimeGenerator.run(args[0],args[1]);
		String inpath = "/Users/krpalle/Perforce/krishna_parsers/dev/memoverse/parsers/test/grammar/VerilogPrime.g4";
		verilogPrimeGenerator.run(inpath,"");
	}

	public void run(String inPath,String outPath){
		File file = new File(inPath);
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ANTLRv4Lexer lexer = null;
		try {
			lexer = new ANTLRv4Lexer(new ANTLRInputStream(inputStream));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ANTLRv4Parser parser = new ANTLRv4Parser(tokens);
		ANTLRv4Parser.GrammarSpecContext tree = parser.grammarSpec();
		List<RuleSpecContext> ruleSpecContextList = tree.rules().ruleSpec();
		StringBuilder sb = new StringBuilder();
		for(RuleSpecContext ruleSpecContext : ruleSpecContextList){
			if(ruleSpecContext.parserRuleSpec() != null){
				sb.append(visitParserRuleSpec(ruleSpecContext.parserRuleSpec()));
				sb.append("\n\n");
			}
		}
		System.out.println(sb.toString());
//		FileOutputStream fileOutputStream = null;
//		try {
//			fileOutputStream = new FileOutputStream(new File(outPath));
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		try {
//			fileOutputStream.write(sb.toString().getBytes());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	/*
	 * parserRuleSpec
	:	DOC_COMMENT?
        ruleModifiers? RULE_REF ARG_ACTION?
        ruleReturns? throwsSpec? localsSpec?
		rulePrequel*
		COLON
            ruleBlock
		SEMI
		exceptionGroup
	;
	 */
	@Override public String visitParserRuleSpec(@NotNull ANTLRv4Parser.ParserRuleSpecContext ctx) { 
		StringBuilder sb = new StringBuilder();
		sb.append(ctx.RULE_REF().getText());
		String ctxname = new String(ctx.RULE_REF().getText().substring(0, 1).toUpperCase() + ctx.RULE_REF().getText().substring(1) + "Context");
		String cls = new String(ctx.RULE_REF().getText().substring(0, 1).toUpperCase() + ctx.RULE_REF().getText().substring(1) + "ContextExt");
		String variable = new String("extendedContext");
		String local = "locals [ " + cls +" " + variable + " ]";
//		String after = "@after { $ctx." + variable+ " = new "+ cls+"($ctx) ;}";
//		String init  = "@init { $ctx." + variable+ " = new "+ cls+"($ctx) ;}";
		sb.append("\n");
		sb.append(local);
//		sb.append("\n");
//		sb.append(after);
//		sb.append("\n");
//		sb.append(init);
		sb.append("\n\t"+ctx.COLON().getText());
		sb.append(" " + visitRuleBlock(ctx.ruleBlock()));
		sb.append(ctx.SEMI().getText());
		return sb.toString();
	}

	/*
	 * ruleBlock
	:	ruleAltList
	;	
	 */
	@Override public String visitRuleBlock(@NotNull ANTLRv4Parser.RuleBlockContext ctx) { 
		return visitRuleAltList(ctx.ruleAltList());
	}

	/*
	 * ruleAltList
	:	labeledAlt (OR labeledAlt)*
	;	
	 */
	@Override public String visitRuleAltList(@NotNull ANTLRv4Parser.RuleAltListContext ctx) { 
		StringBuilder sb = new StringBuilder();
		sb.append(visitLabeledAlt(ctx.labeledAlt(0)));
		for(int i=1;i<ctx.labeledAlt().size();i++){
			sb.append("\n\t"+ctx.OR(0).getText() + " ");
			sb.append(visitLabeledAlt(ctx.labeledAlt(i)));
		}
		return sb.toString();
	}
	
	/*
	 * labeledAlt
	:	alternative (POUND id)?
	;	
	 */
	@Override public String visitLabeledAlt(@NotNull ANTLRv4Parser.LabeledAltContext ctx) { 
		StringBuilder sb = new StringBuilder();
		sb.append(visitAlternative(ctx.alternative()));
		if(ctx.POUND() != null){
			sb.append("\t\t");
			sb.append(ctx.POUND().getText());
			sb.append(ctx.id().getText());
		}
		return sb.toString();
	}
	
	/*
	 * alternative
	:	elementOptions? element*
	;	
	 */
	@Override public String visitAlternative(@NotNull ANTLRv4Parser.AlternativeContext ctx) { 
		StringBuilder sb = new StringBuilder();
		sb.append(visitElement(ctx.element(0)));
		for(int i=1;i<ctx.element().size();i++){
			sb.append(" ");
			sb.append(visitElement(ctx.element(i)));
		}
		return sb.toString();
	}
	
	/*
	 * element
	:	labeledElement
		(	ebnfSuffix
		|
		)
	|	atom
		(	ebnfSuffix
		|
		)
	|	ebnf
	|	ACTION QUESTION? // SEMPRED is ACTION followed by QUESTION
	;	
	 */
	@Override public String visitElement(@NotNull ANTLRv4Parser.ElementContext ctx) { 
		StringBuilder sb = new StringBuilder();
		if(ctx.atom() != null){
			sb.append(visitAtom(ctx.atom()));
			if(ctx.ebnfSuffix() != null){
				sb.append(ctx.ebnfSuffix().getText());
			}
		} else if(ctx.ebnf() != null){
			sb.append(visitEbnf(ctx.ebnf()));
		}
		return sb.toString();
	}
	
	/*
	 * ebnf:	block blockSuffix?
	;	
	 */
	@Override public String visitEbnf(@NotNull ANTLRv4Parser.EbnfContext ctx) { 
		StringBuilder sb = new StringBuilder();
		sb.append(visitBlock(ctx.block()));
		if(ctx.blockSuffix() != null){
			sb.append(ctx.blockSuffix().getText());
		}
		return sb.toString();
	}
	
	
	
	/*
	 *  * atom
	:	range // Range x..y - only valid in lexers
	|	terminal
	|	ruleref
	|	notSet
	|	DOT elementOptions?
	;	
	 */
	@Override public String visitAtom(@NotNull ANTLRv4Parser.AtomContext ctx) { 
		return ctx.getText();
	}
		
	
	/*
	 * block
	:	LPAREN
		( optionsSpec? ruleAction* COLON )?
		altList
		RPAREN
	;	
	 */
	@Override public String visitBlock(@NotNull ANTLRv4Parser.BlockContext ctx) { 
		return new String("( " + visitAltList(ctx.altList()) + " )");
	}

	/*
	 * altList
	:	alternative (OR alternative)*
	;	
	 */
	@Override public String visitAltList(@NotNull ANTLRv4Parser.AltListContext ctx) {
		StringBuilder sb = new StringBuilder();
		sb.append(visitAlternative(ctx.alternative(0)));
		for(int i=1;i<ctx.alternative().size();i++){
			sb.append(" "+ctx.OR(0).getText() + " ");
			sb.append(visitAlternative(ctx.alternative(i)));
		}
		return sb.toString();
	}
	
}
