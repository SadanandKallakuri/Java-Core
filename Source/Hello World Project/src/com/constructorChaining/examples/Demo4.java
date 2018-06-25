package com.constructorChaining.examples;

public class Demo4 {

	public static void main(String[] args) {
		Demo2 d2=new Demo2();
		System.out.println();

		//The JVM calls super() when demo2() is called by any method, and this super() implements the parent class method
		//from which it is inherited.
		Demo2 d22=new Demo2(5);
		System.out.println();
		
		Demo3 d3=new Demo3();
		

	}

}
