package com.jspider.runnable.example;

public class TestRunnable  {

	public static void main(String[] args) {
         
		Runnable r=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("first Thread running");
			}
			
		};
		
		Runnable r1=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("second Thread running");
			}
		};
		
		Thread thread = new Thread(r);
		thread.start();
		
		Thread thread1=new Thread(r1);
		thread1.start();
	
	}

}
