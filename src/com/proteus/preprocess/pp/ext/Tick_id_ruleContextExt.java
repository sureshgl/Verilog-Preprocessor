package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Tick_id_ruleContext;

public class Tick_id_ruleContextExt extends AbstractBaseExt{

	@Getter private Tick_id_ruleContext ctx;

	public Tick_id_ruleContextExt(Tick_id_ruleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).tick_id_rule());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Tick_id_ruleContext){
				this.ctx = (Tick_id_ruleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Tick_id_ruleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
