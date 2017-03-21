package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Conditional_statement_part2Context;
import com.proteus.preprocess.pp.gen.PPParser.Else_pContext;
import com.proteus.preprocess.pp.gen.PPParser.TextContext;
import com.proteus.preprocess.runner.PreprocessRunnerSession;

public class Conditional_statement_part2ContextExt extends AbstractBaseExt{

	@Getter private Conditional_statement_part2Context ctx;

	public Conditional_statement_part2ContextExt(Conditional_statement_part2Context ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).conditional_statement_part2());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Conditional_statement_part2Context){
				this.ctx = (Conditional_statement_part2Context) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Conditional_statement_part2Context.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public TextContext preprocessing(PreprocessRunnerSession prs){
		TextContext textContext = null;
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			if(ctx.getChild(0) instanceof Else_pContext){
				if(ctx.conditional_statement_text()!= null && ctx.conditional_statement_text().getText().length()>0){
					textContext = getExtendedContextVisitor().visit(ctx.conditional_statement_text()).preprocessing(prs);
				}else{
					return null;
				}
			}
		}
		return textContext;
	}

}
