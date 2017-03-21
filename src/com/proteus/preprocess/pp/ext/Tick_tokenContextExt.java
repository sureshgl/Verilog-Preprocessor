package com.proteus.preprocess.pp.ext;

import java.util.HashMap;
import java.util.Map.Entry;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.StartContext;
import com.proteus.preprocess.pp.gen.PPParser.TextContext;
import com.proteus.preprocess.pp.gen.PPParser.Tick_tokenContext;
import com.proteus.preprocess.runner.FileParser;
import com.proteus.preprocess.runner.PreprocessRunnerSession;

public class Tick_tokenContextExt extends AbstractBaseExt{

	@Getter private Tick_tokenContext ctx;

	public Tick_tokenContextExt(Tick_tokenContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).tick_token());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Tick_tokenContext){
				this.ctx = (Tick_tokenContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Tick_tokenContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public TextContext preprocessing(PreprocessRunnerSession prs){
		TextContext textContext = null;
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			MacroKey macroKey = new MacroKey();
			macroKey.setMacroName(ctx.tick_id_rule().TICK_ID().getText().substring(1, ctx.tick_id_rule().TICK_ID().getText().length()));
			macroKey.setNoOfParameters(ctx.tick_token_id().size());
			try{
				HashMap<String,String> parametersMap = new HashMap<String, String>();
				if(ctx.tick_token_id()!=null && ctx.tick_token_id().size()>0 && prs.getMacroMap().get(macroKey).getListOfParameters().size()==ctx.tick_token_id().size()){
					for(int i=0;i<prs.getMacroMap().get(macroKey).getListOfParameters().size();i++){
						parametersMap.put(prs.getMacroMap().get(macroKey).getListOfParameters().get(i), ctx.tick_token_id().get(i).getText());
					}
				}

				FileParser fp = new FileParser();
				StartContext sc = fp.getStartContext(prs.getMacroMap().get(macroKey).getMacroDef());
				sc.extendedContext.preprocessing(prs);
				if(ctx.tick_token_id()!=null && ctx.tick_token_id().size()>0){
					textContext =  (TextContext) new PopulateExtendedContextVisitor().visit(getPrimeParser(replaceparams(sc.extendedContext.getFormattedText(),parametersMap)).text());
				}
				else
				{
					textContext =  (TextContext) new PopulateExtendedContextVisitor().visit(getPrimeParser(sc.extendedContext.getFormattedText()).text());
				}
			}catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("macro defination not found for "+ctx.tick_id_rule().TICK_ID().getText());
			}
		}
		return textContext;

	}

	public String replaceparams(String replacedParams,HashMap<String,String> parametersMap){
		for(Entry<String,String> entry: parametersMap.entrySet()){
			replacedParams = replacedParams.replace(entry.getKey(), entry.getValue());
		}
		return replacedParams;
	}

}
