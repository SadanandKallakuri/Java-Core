package com.inheritance.ex2;

public class Sparrow extends  Bird{
	
	//Extending from higher class requires the constructor to be defined as in the parent class(shown below)
	public Sparrow(String name, int age) {
		super(name, age);
	}
	

}
