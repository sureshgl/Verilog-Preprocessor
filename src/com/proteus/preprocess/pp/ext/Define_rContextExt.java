package com.proteus.preprocess.pp.ext;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Define_rContext;
import com.proteus.preprocess.pp.gen.PPParser.TextContext;
import com.proteus.preprocess.runner.PreprocessRunnerSession;

public class Define_rContextExt extends AbstractBaseExt{

	@Getter private Define_rContext ctx;

	public Define_rContextExt(Define_rContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).define_r());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Define_rContext){
				this.ctx = (Define_rContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Define_rContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public TextContext preprocessing(PreprocessRunnerSession prs){
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			Macro macro = new Macro();
			MacroKey macroKey = new MacroKey();
			List<String> listOfParameters = new ArrayList<String>();
			String macroName = ctx.define_id().ppid_rule(0).PPID().getText();
			if(ctx.define_id().ppid_rule().size()>1){
				for(int i=1;i<ctx.define_id().ppid_rule().size();i++){
					listOfParameters.add(ctx.define_id().ppid_rule(i).PPID().getText());
				}
				macro.setListOfParameters(listOfParameters);
			}
			macro.setMacroName(macroName);
			if(ctx.define_text()!=null){
				macro.setMacroDef(" "+ctx.define_text().extendedContext.getFormattedText()+" ");

			}

			macroKey.setMacroName(macroName);
			macroKey.setNoOfParameters(listOfParameters.size());
			macro.setMacroKey(macroKey);
			if(prs.getMacroMap().containsKey(macroKey)){
				logger.info("macro already exist "+macroKey.getMacroName());
			}
			prs.getMacroMap().put(macroKey, macro);
		}
		addToContexts(null);
		return null;
	}

}
