package com.proteus.preprocess.runner;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import lombok.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proteus.common.util.FileUtils;
import com.proteus.common.util.Utils;
import com.proteus.preprocess.pp.ext.Macro;
import com.proteus.preprocess.pp.ext.MacroKey;
import com.proteus.preprocess.pp.gen.PPParser.StartContext;
import com.proteus.preprocess.runner.util.ModuleIndexer;

@Data
public class PreprocessRunnerSession {
	private static final Logger L = LoggerFactory.getLogger(PreprocessRunnerSession.class);

	private File outputDir;
	private List<File> allInputFilesInOrder;
	private List<String> yOptionFiles;
	private File processingFile;
	private HashMap<MacroKey,Macro> macroMap = new HashMap<MacroKey, Macro>();
	private ModuleIndexer moduleIndexer;
	private PreprocessRunnerSession preprocessRunnerSession;


	private  HashMap<File,Boolean> filePreprocessStatusMap = new HashMap<File, Boolean>();

	public PreprocessRunnerSession(File outputDir,List<File> allInputFilesInOrder, List<String> yOptionFiles ,HashMap<MacroKey,Macro> macroMap,File processingFile,ModuleIndexer moduleIndexer,HashMap<File,Boolean> filePreprocessStatusMap,PreprocessRunnerSession preprocessRunnerSession){
		this.outputDir = outputDir;
		this.allInputFilesInOrder = allInputFilesInOrder;
		this.yOptionFiles = yOptionFiles;
		this.macroMap = macroMap;
		this.processingFile = processingFile;
		this.moduleIndexer =moduleIndexer;
		this.filePreprocessStatusMap = filePreprocessStatusMap;
		this.preprocessRunnerSession = preprocessRunnerSession;

	}

	public StartContext preprocess(){
		FileParser fp = new FileParser();
		if(outputDir.isDirectory() && outputDir.exists()){
			FileUtils.Delete(outputDir, true);
			outputDir.mkdir();
		} else {
			if(outputDir.exists()){
				FileUtils.Delete(outputDir, true);
			}
		}
		this.setProcessingFile(this.allInputFilesInOrder.get(0));
		for(File fileToProcess:this.allInputFilesInOrder){
			StartContext sc = fp.getFileContent(fileToProcess);
			sc.extendedContext.preprocessing(this);
			writeToFile(sc.extendedContext.getFormattedText(),fileToProcess.getName());
		}

		moduleIndexer = index();
		this.setProcessingFile(new File(outputDir+"/"+this.allInputFilesInOrder.get(0).getName()));
		return run();
	}

	public StartContext run(){	
		FileParser fp = new FileParser();
		StartContext sc;
		if(!filePreprocessStatusMap.containsKey(this.getProcessingFile()) || !filePreprocessStatusMap.get(this.getProcessingFile())){
			sc = fp.getFileContent(this.getProcessingFile());
			sc.extendedContext.preprocessing(this);
			writeToFile(sc.extendedContext.getFormattedText(),this.getProcessingFile().getName());
			filePreprocessStatusMap.put(this.processingFile, true);
			sc.extendedContext.processModuleInstantiation(this);
		}else{
			sc = fp.getFileContent(this.processingFile);
			sc.extendedContext.processModuleInstantiation(this);
		}
		return sc;
	}

	private void writeToFile(String processedText,String fileName){
		if(outputDir.exists() || outputDir.mkdirs()){ 
			File preprocessDir = new File(outputDir+"/");
			if(!preprocessDir.exists())
				preprocessDir.mkdir();
			if(new File(preprocessDir+"/"+fileName).exists()){
				throw new RuntimeException("file with same name exists in "+preprocessDir + " directory "+fileName);
			}else{
				File processedFile = new File(preprocessDir+"/"+fileName);
				FileUtils.AppendToFile(processedFile, processedText);
			}
		}else{
			throw new RuntimeException("Couldn't create OP directory: "+outputDir.getAbsolutePath());
		}
	}

	private ModuleIndexer index(){
		List<File> allInputPreprocessedFiles = Utils.newArrList(); 
		for(File file : outputDir.listFiles()){
			allInputPreprocessedFiles.add(file);
			this.getFilePreprocessStatusMap().put(file, true);
		}

		if(yOptionFiles!=null){
			for(String yfilePath:yOptionFiles){
				File directory = new File(this.processingFile.getParent().trim()+"/"+yfilePath);
				for(File file :directory.listFiles()){
					if(file.isFile()){
						allInputPreprocessedFiles.add(file);
						this.getFilePreprocessStatusMap().put(file, false);
					}
				}
			}
		}
		return new ModuleIndexer(allInputPreprocessedFiles);
	}

}
