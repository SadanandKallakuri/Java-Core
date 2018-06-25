package com.exceptionHandling.examples;

public class Ex7 {
	public static void main(String[] args) {
		try {
			divide(5,0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.print("Division has been done");
	}
	public static void divide(int n,int m) throws Exception {
		try {
		System.out.println("Ans is"+(n/m));
		}
		catch(ArithmeticException ex) {
			System.out.println("Caught an Arithmetic exception");
			ex.printStackTrace();
			throw new Exception("Denominator cannot be zero");
		}

}
}
