package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Conditional_statement_part1_else_id_statement_or_nullContext;
import com.proteus.preprocess.pp.gen.PPParser.Elseif_pContext;
import com.proteus.preprocess.pp.gen.PPParser.TextContext;
import com.proteus.preprocess.runner.PreprocessRunnerSession;

public class Conditional_statement_part1_else_id_statement_or_nullContextExt extends AbstractBaseExt{

	@Getter private Conditional_statement_part1_else_id_statement_or_nullContext ctx;

	public Conditional_statement_part1_else_id_statement_or_nullContextExt(Conditional_statement_part1_else_id_statement_or_nullContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).conditional_statement_part1_else_id_statement_or_null());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Conditional_statement_part1_else_id_statement_or_nullContext){
				this.ctx = (Conditional_statement_part1_else_id_statement_or_nullContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Conditional_statement_part1_else_id_statement_or_nullContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public TextContext preprocessing(PreprocessRunnerSession prs){
		TextContext textContext = null;
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			if(ctx.getChild(0) instanceof Elseif_pContext){
				String macroName = ctx.if_id().id().get(0).getText();
				MacroKey macroKey = new MacroKey();
				macroKey.setMacroName(macroName);
				macroKey.setNoOfParameters(0);
				if(prs.getMacroMap().containsKey(macroKey)){
					textContext = getExtendedContextVisitor().visit(ctx.conditional_statement_text()).preprocessing(prs);
				}else{
					return null;
				}
			}else{
				addToContexts(null);
				return null;
			}
		}
		return textContext;
	}
}
