package com.jspider.spring.setexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/jspider/spring/setexample/setconfig.xml");
		CarDealer cd=(CarDealer) ctx.getBean("car");
		System.out.println(cd);
	}

}
