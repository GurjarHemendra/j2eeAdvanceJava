package com.jspider.thread.example;

public class SecondThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("second thread is running");
		}
	}
}
