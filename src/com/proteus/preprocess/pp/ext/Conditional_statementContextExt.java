package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Conditional_statementContext;
import com.proteus.preprocess.pp.gen.PPParser.If_n_def_pContext;
import com.proteus.preprocess.pp.gen.PPParser.If_pContext;
import com.proteus.preprocess.pp.gen.PPParser.TextContext;
import com.proteus.preprocess.runner.PreprocessRunnerSession;

public class Conditional_statementContextExt extends AbstractBaseExt{

	@Getter private Conditional_statementContext ctx;

	public Conditional_statementContextExt(Conditional_statementContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).conditional_statement());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Conditional_statementContext){
				this.ctx = (Conditional_statementContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Conditional_statementContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public TextContext preprocessing(PreprocessRunnerSession prs){
		TextContext textContext = null;
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			String macroName = ctx.if_id().id().get(0).getText();
			MacroKey macroKey = new MacroKey();
			macroKey.setMacroName(macroName);
			macroKey.setNoOfParameters(0);
			if(((ctx.getChild(0) instanceof If_pContext) && prs.getMacroMap().containsKey(macroKey)) || ((ctx.getChild(0) instanceof If_n_def_pContext) && !prs.getMacroMap().containsKey(macroKey))){
				if(ctx.conditional_statement_text()!= null && ctx.conditional_statement_text().getText().length()>0){
					textContext = getExtendedContextVisitor().visit(ctx.conditional_statement_text()).preprocessing(prs);
				}
			}else {
				if(textContext ==null && ctx.conditional_statement_part1()!=null && ctx.conditional_statement_part1().getText().length()>0 ){
					textContext = ctx.conditional_statement_part1().extendedContext.preprocessing(prs);
				}
				if(textContext ==null && ctx.conditional_statement_part2()!=null && ctx.conditional_statement_part2().getText().length()>0){
					textContext = ctx.conditional_statement_part2().extendedContext.preprocessing(prs);
				}
			}
		}
		addToContexts(null);
		return textContext;
	}
}
