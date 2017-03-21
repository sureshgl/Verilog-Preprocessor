package com.proteus.preprocess.runner.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public class ModuleIndexer {
	@Data
	public static class ModuleEntry{
		private final File file;
		private final String moduleName;
		@Override
		public String toString() {
			return  file + ", moduleName=" + moduleName;
		}

	}

	private static final Logger L = LoggerFactory.getLogger(ModuleIndexer.class);
	private final List<File> files;
	private final Map<String,ModuleEntry> index = new LinkedHashMap<String, ModuleEntry>();

	public ModuleIndexer(List<File> files){
		this.files = files;
		try {
			index(files);
		} catch (IOException e) {
			L.error("Error indexing files");
			throw new RuntimeException();
		}
	}

	public void index(List<File> files) throws IOException{
		Pattern modulePattern = Pattern.compile("\\s*(\\bmodule\\b|\\bmacromodule\\b)\\s+(\\w+).*");
		for (File file:files){
			String source = readFile(file);  
			source.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)","");//removing all the comments
			Matcher matcher = modulePattern.matcher(source);
			while(matcher.find())
			{
				String modName = matcher.group(2);
				if(index.containsKey(modName)){
					throw new RuntimeException("Duplicate Module "+modName+" Description exists in files:"+
							file.getAbsolutePath()+" and "+index.get(modName).getFile().getAbsolutePath());
				}else{
					index.put(modName, new ModuleEntry(file, modName));
				}
			}
		}
	}

	public static String readFile(File file) {    
		char[] buffer = null;    
		try {    
			BufferedReader bufferedReader = new BufferedReader( new FileReader(file));    
			buffer = new char[(int)file.length()];    
			int i = 0;    
			int c = bufferedReader.read();    
			while (c != -1) {    
				buffer[i++] = (char)c;    
				c = bufferedReader.read();    
			}    
			bufferedReader.close();
		} catch (IOException e) {    
			e.printStackTrace();    
		}    

		return new String(buffer);    
	}  

	public ModuleEntry getEntryForModule(String moduleName){
		return index.get(moduleName);
	}

	public boolean containsModule(String moduleName){
		return index.containsKey(moduleName);
	}


}
