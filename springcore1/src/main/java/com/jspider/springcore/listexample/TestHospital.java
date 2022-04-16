package com.jspider.springcore.listexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHospital {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/jspider/springcore/listexample/listconfig.xml");
		Hospital h=(Hospital) ctx.getBean("hospital");
		System.out.println(h);
	}
}
