package com.exceptionHandling.examples;

public class Ex6 {

	public static void main(String[] args) {
		divide(5,0);
		System.out.print("Division has been done");
	}
	public static void divide(int n,int m) {
		try {
		System.out.println("Ans is"+(n/m));
		}
		catch(ArithmeticException ex) {
			System.out.println("Caught an Arithmetic exception");
			ex.printStackTrace();
		}

}
}