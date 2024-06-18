package de.demmer.dennis;

import java.io.File;

public class FileUtil {
	
	static String result = "";
													    // "text3.txt"
	public static String printDirectory(File directory, String search) {
		
		if(!directory.isDirectory()) {
			System.out.println("Is not a directory");
			return "File not found";
		}
		
		for (File file : directory.listFiles()) {
			
//			System.out.println(file.getAbsolutePath());
			
			if(file.getName().equals(search)) {
				result = file.getAbsolutePath();
			}
			
			if(file.isDirectory()) {
				printDirectory(file, search);
			}
		}

		
		return result;
	
	}
	

}
