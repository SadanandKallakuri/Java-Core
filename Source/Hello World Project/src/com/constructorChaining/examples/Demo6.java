package com.constructorChaining.examples;

public class Demo6 extends Demo5{

	public void m5() {
	}

	public void m6() {
		m6();
		super.m1();
		super.m2();
	}
	public void m1() {
		super.m1();
	}
	
	
}
