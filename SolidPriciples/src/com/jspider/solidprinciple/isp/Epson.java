package com.jspider.solidprinciple.isp;

public class Epson implements Print, Fax, Scan {

	public void scan() {
         System.out.println("Epson provide scan");
	}

	public void fax() {
		 System.out.println("Epson provide fax");
	}

	public void print() {
		 System.out.println("Epson provide print");
	}

}
