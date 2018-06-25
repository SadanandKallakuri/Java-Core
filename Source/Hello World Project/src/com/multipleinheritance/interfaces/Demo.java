package com.multipleinheritance.interfaces;

public class Demo {

	public static void main(String[] args) {
		Animal animal=new Animal("Elephant", 50);
		animal.eat();
		animal.hasName();
		
		Bird bird=new Bird("Parrot",1);
		bird.eat();
		bird.hasName();
		//bird.fly(); fly is no longer a method of bird
		
		Sparrow sparrow=new Sparrow("Spo", 2);
		sparrow.eat();
		sparrow.hasName();
		sparrow.fly();
		
		System.out.println("-------Polymorphism--------");
		
		//polymorphism
		Animal bird1=new Bird("Peacock",3);
		bird1.hasName();
		//bird1.fly(); compile time error since fly cannot be accessed by animal
		
		Animal sparrow1=new Sparrow("Mi",1);
		sparrow1.hasName();
		//sparrow1.fly(); compile time error
		
		Bird sparrow2=new Sparrow("Kia",2);
		sparrow2.hasName();
		
		System.out.println("-------Multiple Inheritance--------");
		
		//multiple inhreritance (duck,chicken and sparrow implements both flyable and swimmable)
		Duck duck=new Duck("Duck",4);
		duck.fly();
		duck.swim();
		
		Sparrow sparrow3=new Sparrow("Mi",1);
		sparrow3.fly();
		sparrow3.swim();
		
	}

	
}
