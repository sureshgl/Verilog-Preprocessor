package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Timescale_pContext;

public class Timescale_pContextExt extends AbstractBaseExt{

	@Getter private Timescale_pContext ctx;

	public Timescale_pContextExt(Timescale_pContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).timescale_p());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Timescale_pContext){
				this.ctx = (Timescale_pContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Timescale_pContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
