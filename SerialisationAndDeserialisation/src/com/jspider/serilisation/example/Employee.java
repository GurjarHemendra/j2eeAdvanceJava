package com.jspider.serilisation.example;

import java.io.Serializable;

public class Employee implements Serializable{
	String name;

	String mail;

	public Employee(String name, String mail) {
		super();
		this.name = name;
		this.mail = mail;
	}
	
	

}
