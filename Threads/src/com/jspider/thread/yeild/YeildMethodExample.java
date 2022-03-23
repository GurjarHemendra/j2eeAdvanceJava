package com.jspider.thread.yeild;

public class YeildMethodExample {
	
	public static void main(String[] args) {
		
		Runnable r=()->{
			Thread.yield();
			for (int i = 0; i < 20; i++) {
				System.out.println("1st thread running");
			}
		};
		
		Runnable r1=()->{
			for (int i = 0; i < 20; i++) {
				System.out.println("2nd thread running");
			}
		};
		
		Runnable r2=()->{
			for (int i = 0; i < 20; i++) {
				System.out.println("3rd thread running");
			}
		};
		
		Thread t=new Thread(r);
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t.start();
		t1.start();
		t2.start();
		t2.setPriority(10);
	}

}
