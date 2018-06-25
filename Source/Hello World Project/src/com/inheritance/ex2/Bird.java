package com.inheritance.ex2;

public class Bird extends Animal{
	
	//Extending from higher class requires the constructor to be defined as in the parent class(shown below)
	public Bird(String name, int age) {
		super(name, age);
	}
	//overriden method
	public void eat() {
		System.out.println("Eats bugs");
	}
	public void fly() {
		System.out.println("Flying..");
	}
	
}
