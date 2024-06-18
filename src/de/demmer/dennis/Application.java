package de.demmer.dennis;

import java.io.File;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		String path = FileUtil.printDirectory(new File("C:\\Users\\Unknown\\git\\18-06-2024\\ordner1"), "text3.txt");
		System.out.println(path);
//		
//		// Erzeugt ein File Objekt mit einem Dateipfad im Parameter
//		File file = new File("C:\\Users\\Unknown\\git\\18-06-2024\\ordner1");
//		
//		//Überprüft ob das File existiert -> true/false
//		System.out.println(file.exists());
//		
//		//Überprüft ob das File ein Ordner ist -> true/false
//		System.out.println(file.isDirectory());
//		
//		//Listet alle Files in einem Ordner in einem Array auf
//		File[] fileArray = file.listFiles();
//		
//		//Gibt den genauen Pfad des Files als String zurück
//		System.out.println(file.getAbsolutePath());
		

	}
	
	
}
