package com.multipleinheritance.interfaces;

public class Chicken extends Bird implements flyable,swimmable{

	public Chicken(String name, int age) {
		super(name, age);
	}

	@Override
	public void fly() {
		System.out.println("Cannot fly");
	}
	
	@Override
	public void swim() {
System.out.println("Cannot Swim");		
	}
}
