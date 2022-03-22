package com.jspider.garbage.example;

public class Book {

	String bookId;
	String authorName;
	String bookName;

	public Book(String bookId, String authorName, String bookName) {
		super();
		this.bookId = bookId;
		this.authorName = authorName;
		this.bookName = bookName;
	}
  
	
	public void display()
	
	
	
	{
		System.out.println(this.bookId);
		System.out.println(this.bookName);
		System.out.println(this.authorName);
	}
	
	@Override
	protected void finalize() throws Throwable {
			System.out.println("Object deleted finalize method called ");
	}
}
