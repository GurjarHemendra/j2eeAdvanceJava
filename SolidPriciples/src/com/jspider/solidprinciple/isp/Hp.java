package com.jspider.solidprinciple.isp;

public class Hp implements Scan, Print {

	public void print() {
             System.out.println("Hp provide printing");
	}

	public void scan() {
	    System.out.println("Hp provide scan");
	}

}
