package com.jspider.filehandling.example;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {
	public static void main(String[] args) {
		String path = "C:\\Users\\admin\\Desktop\\Demo\\hemendra.txt";
		File file = new File(path);
		if (file.exists()==true) {
			System.out.println("file already created ");
		} else {
			try {
				file.createNewFile();
				System.out.println("file already created");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
