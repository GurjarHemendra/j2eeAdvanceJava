package com.jspider.thread.yeild;

public class JoinExample {
	public static void main(String[] args) {

		Runnable r = () -> {
			
			for (int i = 0; i < 20; i++) {
				System.out.println("1st thread  "+ i+ " instance running");
			}
		};

		Runnable r1 = () -> {
			for (int i = 0; i < 20; i++) {
				System.out.println("2nd thread  "+ i+ " instance running");			}
		};

		Runnable r2 = () -> {
			for (int i = 0; i < 20; i++) {
				System.out.println("3rd thread "+ i+ " instance running");			}
		};

		try {
			Thread t = new Thread(r);
			Thread t1 = new Thread(r1);
			Thread t2 = new Thread(r2);
			t1.start();
			t.start();
			t2.start();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
