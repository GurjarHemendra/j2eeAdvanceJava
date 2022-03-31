package com.jspider.solidprinciple.ocp;

public class DiscountCheck {
	
	double discount =20;
	
	public double calcutor(Customer c)
	{
		if(c.isLoyal())
		{
			discount =discount+10;
		     return discount;	
		}
		return discount;
		
	}

}
