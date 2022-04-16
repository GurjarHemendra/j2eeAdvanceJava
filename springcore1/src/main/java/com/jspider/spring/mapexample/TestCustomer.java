package com.jspider.spring.mapexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {
	
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/jspider/spring/mapexample/mapxonfig.xml");
		 Customer c=(Customer) ctx.getBean("customer");
		System.out.println(c); 
	}

}
