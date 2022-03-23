package com.jspider.thread.task;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("  Normal pass");
		System.out.println("  VIP pass");
		String res = sc.next();
		if (res.equalsIgnoreCase("VIP")) {
			System.out.println("VIP PASS");
		    	
		}
		else
		{
			System.out.println("Normal pass");
		}
		
		Runnable e=()->{
			System.out.println("VIP PASS");
		};
		
		Runnable e1=()->{
			System.out.println("NORMAL PASS");
		};
		
	}
}
