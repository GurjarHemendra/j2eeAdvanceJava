package org.jspider.spring.springcore1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("org/jspider/spring/springcore1/springconfig.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		System.out.println(emp);
	}

}
