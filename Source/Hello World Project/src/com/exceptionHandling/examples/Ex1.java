package com.exceptionHandling.examples;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("Line 1");		
		System.out.println("");
		String str=null;
		str.getClass();
		System.out.println("Line 2"+(5/0));
		System.out.println("Line 3");
}
}
