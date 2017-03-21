package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Id_with_number_ruleContext;

public class Id_with_number_ruleContextExt extends AbstractBaseExt{

	@Getter private Id_with_number_ruleContext ctx;

	public Id_with_number_ruleContextExt(Id_with_number_ruleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).id_with_number_rule());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Id_with_number_ruleContext){
				this.ctx = (Id_with_number_ruleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Id_with_number_ruleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
