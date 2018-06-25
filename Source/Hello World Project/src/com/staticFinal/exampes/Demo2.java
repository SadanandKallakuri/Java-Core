package com.staticFinal.exampes;

public class Demo2 {
	static {
		System.out.println("In static block 1");
	}
	static {
		System.out.println("In static block 2");
	}
	static {
		System.out.println("In static block 3");
	}
	static {
		System.out.println("In static block 4");
	}
	public Demo2() {
		System.out.println("In default constructor");
	}
	public static void main(String[] args) {
		Demo2 d2=new Demo2();
		System.out.println();
		
		Demo2 d3=new Demo2();


	}

}
