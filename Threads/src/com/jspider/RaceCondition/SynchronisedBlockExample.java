package com.jspider.RaceCondition;

public class SynchronisedBlockExample {

	static String s = "hi"; // shared resource

	public static void main(String[] args) {

		Runnable r1 = () -> {
			synchronized (s) {
				System.out.println("thread 1 locked string");
				s = s + "java";
				System.out.println(s);

			}
			System.out.println("thread1 released the lock");
		};

		Runnable r2 = () -> {
			synchronized (s) {
				System.out.println("thread 2 locked String");
				s = s + "python";
				System.out.println(s);
			}
			System.out.println("thread 2 released lock");
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}
