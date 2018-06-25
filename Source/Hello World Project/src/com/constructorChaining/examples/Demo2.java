package com.constructorChaining.examples;

public class Demo2 extends Demo1{
	public Demo2() {
		System.out.println("In Demo2 class default constructor");
	}
	public Demo2(int x) {
		//super("sup",4);
		this("ssss",4);
		System.out.println("In Demo2 class with 1 parameter constructor");
	}
	public Demo2(String s,int y) {
		System.out.println("In Demo2 class with 2 parameters constructor");
	}
}
