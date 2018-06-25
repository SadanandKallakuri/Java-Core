package com.exceptionHandling.examples;

public class Ex3 {

	public static void main(String[] args) {
		try {
			int[] a=new int[3];
			System.out.println("Line 1");		
			System.out.println("");
			a[5]=2;
			String str=null;
			str.getClass();
			System.out.println("Line 2"+(5/0));
			System.out.println("Line 3");
		}
		catch(NullPointerException ex) {
			System.out.println("Caught an Null Pointer exception");
			ex.printStackTrace();
		}
		catch(ArithmeticException ex) {
			System.out.println("Caught an Arithmetic exception");
			ex.printStackTrace();
		}
		catch(Exception ex) {
			System.out.println("Caught an exception");
			ex.printStackTrace();
		}
		System.out.println("");
		System.out.println("Outside try and catch");
	}

}
