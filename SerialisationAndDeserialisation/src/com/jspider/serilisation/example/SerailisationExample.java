package com.jspider.serilisation.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerailisationExample {
	public static void main(String[] args) {
		String path = "C:\\Users\\Administrator\\Desktop\\emp.ser";
		File f = new File(path);
		try {
			f.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		FileOutputStream fos = null;
		ObjectOutputStream os = null;
		Employee emp = new Employee("babu", "babu007@gmail.com");
		try {
			fos = new FileOutputStream(f);
			os = new ObjectOutputStream(fos);
			os.writeObject(emp);
			System.out.println("object is serialised");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
