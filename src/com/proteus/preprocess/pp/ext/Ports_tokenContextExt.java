package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Ports_tokenContext;

public class Ports_tokenContextExt extends AbstractBaseExt{

	@Getter private Ports_tokenContext ctx;

	public Ports_tokenContextExt(Ports_tokenContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).ports_token());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Ports_tokenContext){
				this.ctx = (Ports_tokenContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Ports_tokenContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
