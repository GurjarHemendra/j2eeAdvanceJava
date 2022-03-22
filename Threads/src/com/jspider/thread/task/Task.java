package com.jspider.thread.task;

import java.util.Scanner;

public class Task {
	
	public static void main(String[] args) {
		// take input from user 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1  :  Normal pass");
		System.out.println("enter 2  :  VIP pass");
		int res=sc.nextInt();
		Runnable r1=null;
		Runnable r2=null;
		switch (res) {
		case 1: {
			 r1=()->{
			     for (int i = 0; i <10; i++) {
					System.out.println("seats should be reserved to Normal pass");
				}	
			};
		}
		case 2:  
		{
			 r2=()->{
			     for (int i = 0; i <10; i++) {
					System.out.println("seats should be reserved to VIP pass");
				}	
			};
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + res);
		}
	
	
	}

}
