package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Npp_statementsContext;

public class Npp_statementsContextExt extends AbstractBaseExt{

	@Getter private Npp_statementsContext ctx;

	public Npp_statementsContextExt(Npp_statementsContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).nl());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Npp_statementsContext){
				this.ctx = (Npp_statementsContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Npp_statementsContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
