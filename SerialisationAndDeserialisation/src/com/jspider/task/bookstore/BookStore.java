package com.jspider.task.bookstore;

public class BookStore {

	String bookName;
	String BookId;
	double price;

	public BookStore(String bookName, String bookId, double price) {
		super();
		this.bookName = bookName;
		BookId = bookId;
		this.price = price;
	}
	
	{
		System.out.println("Welcome to the book store ");
	}
	
  // method to print invoice
	public void printInvoice(BookStore b1 , int quantity)
	{
         // call the price method to finalise the prince 
		double price=price(b1,quantity);
		System.out.println("Book Purchase "+b1.bookName);
		System.out.println("Book Id "+b1.BookId);
		System.out.println("Quantity purchased "+quantity);
		System.out.println("Final price for "+quantity+" book is "+price+" Rs");
		
	}
	// method to get Price
	
	public double price(BookStore b,int quantity)
	{
		double price =  b.price *quantity;
		return price;
		
	}
	//main method
	public static void main(String[] args) {
		BookStore b1=new BookStore("Wings of Fire","APJ1121",180.35);
		b1.printInvoice(b1, 10);;
	}

}

 	