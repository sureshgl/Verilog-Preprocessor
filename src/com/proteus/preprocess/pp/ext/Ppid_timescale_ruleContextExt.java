package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Ppid_timescale_ruleContext;

public class Ppid_timescale_ruleContextExt extends AbstractBaseExt{

	@Getter private Ppid_timescale_ruleContext ctx;

	public Ppid_timescale_ruleContextExt(Ppid_timescale_ruleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).ppid_timescale_rule());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Ppid_timescale_ruleContext){
				this.ctx = (Ppid_timescale_ruleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Ppid_timescale_ruleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
