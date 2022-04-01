 package com.jspider.solidprinciple.ocp;

public class Drivver1 {
	public static void main(String[] args) {

		DiscountCheck discountCheck = new DiscountCheck();

		Customer c1 = new CarLoan();
		double finalprice = discountCheck.calcutor(c1);
		System.out.println("discount after loyality " + finalprice);

		Customer c2 = new HomeLoan();
		double finalP = discountCheck.calcutor(c2);
		System.out.println("discount after loyality "+finalP);
	}

}
