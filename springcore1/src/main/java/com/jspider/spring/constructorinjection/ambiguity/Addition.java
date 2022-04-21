package com.jspider.spring.constructorinjection.ambiguity;

public class Addition {
	
	Addition(double a , double b)
	{
		System.out.println("double constructor");
	}
	Addition(int a , int b)
	{
		System.out.println("integer constructor");
	}
//	Addition(String a, String b)
//	{
//		System.out.println("S tring constructor");
//	}

}
