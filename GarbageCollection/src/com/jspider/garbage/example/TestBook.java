package com.jspider.garbage.example;

public class TestBook {
           public static void main(String[] args) {
			
        	   Book b=new Book("101","ABC","XYZ");
        	   b=null;
        	   System.gc();
        	   
        	  new Book("102","CDN","PQR");
        	  System.gc(); 
		}
}
