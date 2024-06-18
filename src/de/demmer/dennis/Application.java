package de.demmer.dennis;

import java.io.File;

public class Application {

	public static void main(String[] args) {
		
//		FileUtil.printDirectory(new File("C:\\Users\\Beispiel\\Documents"));
		
		
		
		RecTest rTest = new RecTest();
		
		int ergebnis = rTest.sum(2);
		System.out.println(ergebnis);
		
	}
	
	
}
