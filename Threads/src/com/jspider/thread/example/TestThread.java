package com.jspider.thread.example;

public class TestThread {
	
	public static void main(String[] args) {
		
		FirstThread f1=new FirstThread();
		f1.start();
		
		SecondThread f2=new SecondThread();
		f2.start();
	}

}
