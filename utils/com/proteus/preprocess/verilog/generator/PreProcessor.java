package com.proteus.preprocess.verilog.generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

public class PreProcessor {

	public static void VerilogProcess(){
		////		pp(String rootdir,String outputdir)
		//		pp()
	}

	public static List<String> ListOfProcessedStrings(List<File> fileList, String linesep) {
		List<String> pStringList = new ArrayList<String>();

		//		List<String> files = com.proteus.common.util.FileUtils.ReadLines(new File("/Users/kmalempa/Perforce/kotesh_mac_t2/dev/memoverse/parsers/test/com.proteus.preprocess.verilog/userInputFiles/source_text/1k6l_a114/rtl/test.test"));

		//		for(String filename :files ){
		//			if(filename.endsWith(".k")) 
		//				pStringList.add(PreProcessFileIntoString(new File(filename), linesep));
		//		}


		for(File filename :fileList ){
			if(filename.getName().endsWith(".v")) 
				pStringList.add(PreProcessFileIntoString(filename, linesep));
		}
		return pStringList;
	}

	public static String PreProcessFileIntoString(File fileName, String linesep){
		String name = null;

		try {
			name = fileName.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return readAndPrintFile(name);
	}

	public static String readAndPrintFile(String fileName) {
		int ch;
		//		boolean tokenCheck = false;
		boolean slashCommentFound = false;
		boolean starCommentFound = false;
		boolean firstSlashFound = false;
		boolean firstStarFound = false;
		boolean closingStarFound = false;
		boolean startDoubleQuoteFound = false;
		//		int lastChar= -1;

		StringBuilder sb = new StringBuilder();

		try {

			BufferedReader reader = new BufferedReader(new FileReader(fileName));

			while ((ch = reader.read()) != -1) {

				if (ch == '\"') {
					if (startDoubleQuoteFound == false) {
						startDoubleQuoteFound = true;
					} else if (startDoubleQuoteFound == true) {
						startDoubleQuoteFound = false;
					}
				}

				if (startDoubleQuoteFound
						&& (starCommentFound == true || slashCommentFound == true)) {
					continue;
				}
				if (ch == '/') {
					if (starCommentFound == true && closingStarFound == false) {
						continue;
					}
					if (closingStarFound && starCommentFound == true) {
						starCommentFound = false;
						closingStarFound = false;
						firstStarFound = false;
						continue;
					} else if (firstSlashFound && slashCommentFound == false
							&& starCommentFound == false) {
						slashCommentFound = true;
						firstSlashFound = false;
						continue;
					} 
					else if (slashCommentFound == false
							&& starCommentFound == false
							&& startDoubleQuoteFound == false) {
						firstSlashFound = true;

						continue;
					}  
				}
				if (ch == '*') {
					if (starCommentFound) {
						closingStarFound = true;
						continue;
					}
					if (firstSlashFound && starCommentFound == false) {
						starCommentFound = true;
						firstSlashFound = false;
						continue;
					} else if (firstStarFound == false
							&& starCommentFound == true) {
						firstStarFound = true;
						continue;
					}
				}
				if (ch == '\n') {
					if (slashCommentFound) {
						slashCommentFound = false;
						firstStarFound = false;
						firstSlashFound = false;
						starCommentFound = false;
						//						System.out.print((char) ch);
						sb.append((char) ch);
						continue;
					}
				}

				if (starCommentFound == true && closingStarFound == false) {
					continue;
				}

				if (ch != '/' && ch != '*') {
					if (closingStarFound) {
						//						System.out.print((char) lastChar);
						//						sb.append((char) lastChar);
					}
					if(firstSlashFound){
						//						System.out.print("/");
						sb.append("/");
					}
					closingStarFound = false;
					firstSlashFound = false;
					firstStarFound = false;
					closingStarFound = false;

				}

				if (slashCommentFound == false && starCommentFound == false) {
					//					System.out.print((char) ch);
					sb.append((char) ch);
				} 

			}

			reader.close();

		} catch (FileNotFoundException ex) {
			System.out.println(fileName + " not found");
		} catch (Exception ex) {
			System.out.println("Error reading file " + fileName);
			ex.printStackTrace();
		}
		return sb.toString();
	}

	public static void main(String[] args) throws IOException
	{
		File dir = new File("/Users/kmalempa/Perforce/kotesh_mac_t2/dev/memoverse/parsers/bin/com.proteus.preprocess.verilog/userInputFiles/source_text");

		System.out.println("Getting all files in " + dir.getCanonicalPath() + " including those in subdirectories");
		List<File> files = (List<File>) FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println("file: " + file.getCanonicalPath());
		}

		String file = readAndPrintFile("/Users/kmalempa/Perforce/kotesh_mac_t2/dev/memoverse/parsers/test/com.proteus.preprocess.verilog/sourcedata/1k6l_a114/rtl/algo_1k6l_a114_sva_wrap.v");
		System.out.println(file);
		//		System.out.println(PreProcessFileIntoString(new File("/Users/kmalempa/Perforce/kotesh_mac_t2/dev/memoverse/parsers/test/com.proteus.preprocess.verilog/sourcedata/1k6l_a114/rtl/algo_1k6l_a114_sva_wrap.v"), " "));
	}
}
