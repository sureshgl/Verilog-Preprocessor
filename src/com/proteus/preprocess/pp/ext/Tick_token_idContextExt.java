package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Tick_token_idContext;

public class Tick_token_idContextExt extends AbstractBaseExt{

	@Getter private Tick_token_idContext ctx;

	public Tick_token_idContextExt(Tick_token_idContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).tick_token_id());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Tick_token_idContext){
				this.ctx = (Tick_token_idContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Tick_token_idContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
