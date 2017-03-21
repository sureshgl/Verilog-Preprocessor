package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Lparenstar_ruleContext;

public class Lparenstar_ruleContextExt extends AbstractBaseExt{

	@Getter private Lparenstar_ruleContext ctx;

	public Lparenstar_ruleContextExt(Lparenstar_ruleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).lparenstar_rule());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Lparenstar_ruleContext){
				this.ctx = (Lparenstar_ruleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Lparenstar_ruleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
