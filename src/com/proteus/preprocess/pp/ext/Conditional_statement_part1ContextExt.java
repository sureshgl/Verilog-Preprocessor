package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Conditional_statement_part1Context;
import com.proteus.preprocess.pp.gen.PPParser.TextContext;
import com.proteus.preprocess.runner.PreprocessRunnerSession;

public class Conditional_statement_part1ContextExt extends AbstractBaseExt{

	@Getter private Conditional_statement_part1Context ctx;

	public Conditional_statement_part1ContextExt(Conditional_statement_part1Context ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).conditional_statement_part1());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Conditional_statement_part1Context){
				this.ctx = (Conditional_statement_part1Context) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Conditional_statement_part1Context.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
    public TextContext preprocessing(PreprocessRunnerSession prs){
		TextContext textContext = null;
            if(ctx != null && ctx.children != null && ctx.children.size()>0){
                    for(int i=0; i<ctx.conditional_statement_part1_else_id_statement_or_null().size(); i++){
                    	textContext = getExtendedContextVisitor().visit(ctx.conditional_statement_part1_else_id_statement_or_null(i)).preprocessing(prs);
                        if(textContext!=null) 
                    	return textContext;
                    }
            }
            return textContext;
    }
}
