package com.jspider.filehandling.example;

import java.io.File;

public class FolderCreateExample {
	
	public static void main(String[] args) {
		
		 File f = new File("C:\\Users\\admin\\Desktop\\WEJM3");
		 if (f.exists()==true) {
			// exist() :  check wthere folder is present or not
			 System.out.println("Folder Already created ");
		}
		 else
		 {
			 f.mkdir();
			 System.out.println("folder successfully created ");
		 }
	}

}
