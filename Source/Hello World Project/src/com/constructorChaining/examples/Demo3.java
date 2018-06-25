package com.constructorChaining.examples;

public class Demo3 extends Demo1{
	public Demo3() {
		System.out.println("In Demo3 class default constructor");
	}
	public Demo3(int x) {
		System.out.println("In Demo3 class with 1 parameter constructor");
	}
	public Demo3(String s,int y) {
		System.out.println("In Demo3 class with 2 parameters constructor");
	}
}
