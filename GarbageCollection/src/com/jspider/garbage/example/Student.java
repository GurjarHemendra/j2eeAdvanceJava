package com.jspider.garbage.example;

public class Student {
	String name;
	int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	protected void finalize() {
	   System.out.println("finalize methhod called ");
	}

}
