package com.staticFinal.exampes;

public class Demo {

	public static void main(String[] args) {
		System.out.println("In Demo Class");
		Demo1 d1=new Demo1();
		d1.m1();
		Demo1.m2();
		//d1.m2();also valid but it gives a warning since static methods don't need initialization
	}

}
