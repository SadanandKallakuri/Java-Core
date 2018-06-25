package com.exceptionHandling.examples;

public class Ex2 {

	public static void main(String[] args) {
		try {
			System.out.println("Line 1");		
			System.out.println("");
			System.out.println("Line 2"+(5/0));
			System.out.println("Line 3");
		}
		catch(ArithmeticException ex) {
			System.out.println("Caught an exception");
			ex.printStackTrace();
		}
		System.out.println("Outside try and catch");
	}

}
