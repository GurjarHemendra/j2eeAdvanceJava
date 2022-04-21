package com.jspider.spring.constructort.primitive;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/jspider/spring/constructort/primitive/config.xml");
		Employee emp=(Employee) ctx.getBean("employee");
		System.out.println(emp);
	}
}
