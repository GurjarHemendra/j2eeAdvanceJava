package com.jspider.first.springcore1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/jspider/first/springcore1/springconfig.xml");
		Employee emp=(Employee) ctx.getBean("employee");
		System.out.println(emp);
	}

}
