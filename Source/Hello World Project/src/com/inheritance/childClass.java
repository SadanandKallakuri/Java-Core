package com.inheritance;

public class childClass extends simpleInheritance{

	public void hasCar() {
		System.out.println("Child car is BMW");
	}
	
	//@overriden
	public void hasProperty() {
		System.out.println("In child class");
	}
	
	
	//@overriden
	public void hasLand() {
		double acre=45;
		System.out.println("Area is "+acre+" sqft");
	}
}
