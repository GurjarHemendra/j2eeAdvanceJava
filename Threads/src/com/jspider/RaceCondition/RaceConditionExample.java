package com.jspider.RaceCondition;

public class RaceConditionExample {
	
	static int x=0;
	
	public synchronized void increment()
	{
		x=x+1;
	}
	
	public synchronized void decrement()
	{
		x--;
	}
	
	public  synchronized  void display()
	{
		System.out.println(x);
	}
   
	public static void main(String[] args) {
		
		RaceConditionExample r = new RaceConditionExample();
		
		Runnable r1=()->{
			r.increment();
			r.display();
		};
		
		Runnable r2=()->{
			r.decrement();
			r.display();
		};
		
		Thread t=new Thread(r1);
		Thread t1=new Thread(r2);
		t.start();
		t1.start();
	}
}
