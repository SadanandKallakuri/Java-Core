package com.multipleinheritance.interfaces;

public class Sparrow extends  Bird implements flyable,swimmable{
	
	//Extending from higher class requires the constructor to be defined as in the parent class(shown below)
	public Sparrow(String name, int age) {
		super(name, age);
	}

	@Override
	public void fly() {
		System.out.println("Flying..");
	}
	@Override
	public void swim() {
System.out.println("Cannot Swim");		
	}
}
