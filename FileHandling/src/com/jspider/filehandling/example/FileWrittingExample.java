package com.jspider.filehandling.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrittingExample {
	
	public static void main(String[] args) {
		FileWriter fw=null;
		String path="C:\\Users\\admin\\Desktop\\Demo\\hemendra.txt";
		File file = new File(path);
		String content="new data written ";
		try {
			fw = new FileWriter(file);
			fw.write(content);
			fw.flush();
			System.out.println("file writting completed");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
