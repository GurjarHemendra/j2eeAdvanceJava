package com.jspider.filehandling.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {
	public static void main(String[] args) {
		String path = "C:\\Users\\admin\\Desktop\\Demo\\hemendra1.txt";
		File file = new File(path);
		FileReader fr=null;
		long length = file.length();
//		creating array for which we can store the data of the file 
		char []c=new char[(int) length];
		try {
			fr=new FileReader(file);
			fr.read(c);
			System.out.println(c);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		}
	}

}
