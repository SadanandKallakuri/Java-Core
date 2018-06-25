package com.exceptionHandling.examples;

public class Ex5 {

	public static void main(String[] args) {
		try {
			System.out.println("Line 1");		
			System.out.println("");
			System.out.println("Line 2"+(5/0));
			System.out.println("Line 3");
			System.out.println("Close DB connection");
		}
		catch(ArithmeticException ex) {
			System.out.println("Caught an exception");
			ex.printStackTrace();
		}
		finally{
			System.out.println("Close DB connection");
		}
		//try can exist in three combinations(try-catch,try-finally,try-catch-finally)
		}
	}
