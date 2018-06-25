package com.multipleinheritance.interfaces;

public class Duck extends Bird implements flyable,swimmable {

	public Duck(String name, int age) {
		super(name, age);
	}

	@Override
	public void fly() {
		System.out.println("Can Fly");		
	}
	
	@Override
	public void swim() {
System.out.println("Can Swim");		
	}
}
