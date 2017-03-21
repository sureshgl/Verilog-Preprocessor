package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.IdContext;

public class IdContextExt extends AbstractBaseExt{

	@Getter private IdContext ctx;

	public IdContextExt(IdContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).id());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof IdContext){
				this.ctx = (IdContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+IdContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
