package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Parameter_value_assignmentContext;

public class Parameter_value_assignmentContextExt extends AbstractBaseExt{

	@Getter private Parameter_value_assignmentContext ctx;

	public Parameter_value_assignmentContextExt(Parameter_value_assignmentContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).parameter_value_assignment());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Parameter_value_assignmentContext){
				this.ctx = (Parameter_value_assignmentContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Parameter_value_assignmentContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
