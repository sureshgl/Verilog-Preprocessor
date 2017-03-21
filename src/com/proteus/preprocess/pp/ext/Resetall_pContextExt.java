package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Resetall_pContext;

public class Resetall_pContextExt extends AbstractBaseExt{

	@Getter private Resetall_pContext ctx;

	public Resetall_pContextExt(Resetall_pContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).resetall_p());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Resetall_pContext){
				this.ctx = (Resetall_pContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Resetall_pContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
