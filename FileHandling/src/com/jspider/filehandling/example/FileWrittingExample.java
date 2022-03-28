package com.jspider.filehandling.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrittingExample {
	
	public static void main(String[] args) {
		String path="C:\\Users\\admin\\Desktop\\Demo\\hemendra1.txt";
		File file = new File(path);
		
		FileWriter fw=null;
		String content="new data written ";
		try {
			 fw = new FileWriter(file);
			 fw.write(content);
			 fw.flush();
			 System.out.println("data written successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	
	}
}
