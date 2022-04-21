package com.jspider.spring.constructorinjection.ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdditon {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/jspider/spring/constructorinjection/ambiguity/mapxonfig.xml");
		Addition a=(Addition) ctx.getBean("addition");
		System.out.println(a);
	}

}
