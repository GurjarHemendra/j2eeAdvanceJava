package com.jspider.runnable.example;

public class ThreadMethods {
	
	public static void main(String[] args) {
		
		Runnable r1=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("1st thread running");
			}
		};
		
		Runnable r2=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("2nd thread running");
			}
		};
	
	
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		System.out.println("default name is "+t1.getName());
		System.out.println("id is "+t1.getId());
		t1.setName("pankaj");
		System.out.println("updated name is "+t1.getName());
		t2.start();
	
	
	}

}
