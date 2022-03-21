package com.jspider.thread.example;

public class FirstThread extends Thread {
  
	@Override
	public void run() {
              // buisness logic here
		for (int i = 0; i < 10; i++) {
			System.out.println("first thread is running");
		}
	}
}
