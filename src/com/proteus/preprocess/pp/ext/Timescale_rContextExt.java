package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.TextContext;
import com.proteus.preprocess.pp.gen.PPParser.Timescale_rContext;
import com.proteus.preprocess.runner.PreprocessRunnerSession;

public class Timescale_rContextExt extends AbstractBaseExt{

	@Getter private Timescale_rContext ctx;

	public Timescale_rContextExt(Timescale_rContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).timescale_r());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Timescale_rContext){
				this.ctx = (Timescale_rContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Timescale_rContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public TextContext preprocessing(PreprocessRunnerSession prs){
		addToContexts(null);
		return null;
	}
}
