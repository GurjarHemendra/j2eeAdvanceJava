package com.jspider.runnable.example;

public class ThreadPriority {
public static void main(String[] args) {
		
		Runnable r1=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("1st thread running");
			}
		};
		
		Runnable r2=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("2nd thread runningy");
			}
		};
	
	
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		System.out.println(t1.getPriority());
		t1.setPriority(10);
		t2.start();

}
}
