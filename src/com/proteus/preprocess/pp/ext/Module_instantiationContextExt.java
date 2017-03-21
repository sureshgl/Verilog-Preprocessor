package com.proteus.preprocess.pp.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.preprocess.pp.PopulateExtendedContextVisitor;
import com.proteus.preprocess.pp.gen.PPParser.Module_instantiationContext;
import com.proteus.preprocess.runner.PreprocessRunnerSession;

public class Module_instantiationContextExt extends AbstractBaseExt{

	@Getter private Module_instantiationContext ctx;

	public Module_instantiationContextExt(Module_instantiationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).module_instantiation());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Module_instantiationContext){
				this.ctx = (Module_instantiationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Module_instantiationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}


	@Override
	public void processModuleInstantiation(PreprocessRunnerSession preprocessRunnerSession){
		if(ctx != null && ctx.children != null && ctx.children.size()>0){
			if(ctx.id().ID()!=null &&ctx.id().ID().getText().length()>0){
				if((preprocessRunnerSession.getModuleIndexer().containsModule(ctx.id().ID().getText()))){
					if(preprocessRunnerSession.getFilePreprocessStatusMap().containsKey(preprocessRunnerSession.getModuleIndexer().getEntryForModule(ctx.id().ID().getText()).getFile())){
						if(!preprocessRunnerSession.getFilePreprocessStatusMap().get(preprocessRunnerSession.getModuleIndexer().getEntryForModule(ctx.id().ID().getText()).getFile()))
							if(!(preprocessRunnerSession.getProcessingFile().equals(preprocessRunnerSession.getModuleIndexer().getEntryForModule(ctx.id().ID().getText()).getFile()))){
								PreprocessRunnerSession preprocessRunnerSessionChild = new PreprocessRunnerSession(preprocessRunnerSession.getOutputDir(), preprocessRunnerSession.getAllInputFilesInOrder(),preprocessRunnerSession.getYOptionFiles(), preprocessRunnerSession.getMacroMap(),preprocessRunnerSession.getModuleIndexer().getEntryForModule(ctx.id().ID().getText()).getFile(),preprocessRunnerSession.getModuleIndexer(),preprocessRunnerSession.getFilePreprocessStatusMap(), null);
								preprocessRunnerSession.setPreprocessRunnerSession(preprocessRunnerSessionChild);
								preprocessRunnerSessionChild.run();
								preprocessRunnerSessionChild.getFilePreprocessStatusMap().put(preprocessRunnerSession.getModuleIndexer().getEntryForModule(ctx.id().ID().getText()).getFile(), true);
							}
					}
				}else{
					throw new RuntimeException("module declaration not found for "+ctx.id().ID().getText() +" in "+preprocessRunnerSession.getProcessingFile());
				}
			}
		}
	}

}
