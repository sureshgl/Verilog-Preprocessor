package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Macromodule_ruleContext;

public class Macromodule_ruleContextExt extends AbstractBaseExt{

	@Getter private Macromodule_ruleContext ctx;

	public Macromodule_ruleContextExt(Macromodule_ruleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).macromodule_rule());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Macromodule_ruleContext){
				this.ctx = (Macromodule_ruleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Macromodule_ruleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
