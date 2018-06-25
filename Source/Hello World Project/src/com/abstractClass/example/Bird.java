package com.abstractClass.example;

public class Bird extends Animal{
	
	//Extending from higher class requires the constructor to be defined as in the parent class(shown below)
	public Bird(String name, int age) {
		super(name, age);
	}
	//overriden method
	public void eat() {
		System.out.println("Eats bugs");
	}
	
	//since animal is an abstract class its child class must implement its abstract methods
	@Override
	public void move() {		
	}
	
	/*
	public void fly() {
		System.out.println("Flying..");
	}  as all birds cannot fly
	*/
	
}
