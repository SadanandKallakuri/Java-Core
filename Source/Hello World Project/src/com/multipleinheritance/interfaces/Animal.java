package com.multipleinheritance.interfaces;

public class Animal {
	String name;
	int age;

	public Animal(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void eat() {
		System.out.println("Eats other animals");
	}
	public void hasName() {
		System.out.println("Name: "+name );
	}
	
}
