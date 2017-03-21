package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Resetall_rContext;
import com.proteus.preprocess.pp.gen.PPParser.TextContext;
import com.proteus.preprocess.runner.PreprocessRunnerSession;

public class Resetall_rContextExt extends AbstractBaseExt{

	@Getter private Resetall_rContext ctx;

	public Resetall_rContextExt(Resetall_rContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).resetall_r());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Resetall_rContext){
				this.ctx = (Resetall_rContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Resetall_rContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public TextContext preprocessing(PreprocessRunnerSession prs){
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			prs.getMacroMap().clear();
		}
		addToContexts(null);
		return null;
	}

}
