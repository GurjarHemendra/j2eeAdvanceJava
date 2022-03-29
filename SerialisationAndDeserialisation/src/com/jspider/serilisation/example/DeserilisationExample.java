package com.jspider.serilisation.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilisationExample {
	public static void main(String[] args) {
		String path = "C:\\Users\\Administrator\\Desktop\\emp.ser";
		File f = new File(path);
		FileInputStream fis=null;
		ObjectInputStream  ios=null;
		
		try {
			fis=new FileInputStream(f);
			ios=new ObjectInputStream(fis);
			 Employee emp=(Employee) ios.readObject();
			 System.out.println(emp.name);
			 System.out.println(emp.mail);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				fis.close();
				ios.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
