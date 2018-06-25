package com.abstractClass.example;

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
	public void move() {	
		System.out.println("Can Fly and Swim");		

	}
}
