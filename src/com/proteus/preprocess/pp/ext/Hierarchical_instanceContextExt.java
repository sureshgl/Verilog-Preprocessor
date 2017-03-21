package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Hierarchical_instanceContext;

public class Hierarchical_instanceContextExt extends AbstractBaseExt{

	@Getter private Hierarchical_instanceContext ctx;

	public Hierarchical_instanceContextExt(Hierarchical_instanceContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).hierarchical_instance());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Hierarchical_instanceContext){
				this.ctx = (Hierarchical_instanceContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Hierarchical_instanceContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
