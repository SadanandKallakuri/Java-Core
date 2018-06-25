package com.abstractClass.example;

public class Demo {

	public static void main(String[] args) {
		/*cannot instantiate animal class as it is an abstract class
		Animal animal=new Animal("Elephant", 50);
		animal.eat();
		animal.hasName();
		*/
		
		Bird bird=new Bird("Parrot",1);
		bird.eat();
		bird.hasName();
		//bird.fly(); fly is no longer a method of bird
		
		
		System.out.println("-------Polymorphism--------");
		
		//polymorphism
		Animal bird1=new Bird("Peacock",3);
		bird1.hasName();
		bird1.move();
		//bird1.fly(); compile time error since fly cannot be accessed by animal
		
		System.out.println("-------Multiple Inheritance--------");
		
		//multiple inhreritance (duck,chicken and sparrow implements both flyable and swimmable)
		Duck duck=new Duck("Duck",4);
		duck.fly();
		duck.swim();
		duck.move();
		
		
	}

	
}
