package com.inheritance.ex2;

public class demoWithPolymorphism {

	public static void main(String[] args) {
		Animal animal=new Animal("Elephant", 50);
		animal.eat();
		animal.hasName();
		
		Bird bird=new Bird("Parrot",1);
		bird.eat();
		bird.hasName();
		bird.fly();
		
		Sparrow sparrow=new Sparrow("Spo", 2);
		sparrow.eat();
		sparrow.hasName();
		sparrow.fly();
		
		System.out.println("-------polymorphism--------");
		
		//polymorphism
		Animal bird1=new Bird("Peacock",3);
		bird1.hasName();
		//bird1.fly(); compile time error since fly cannot be accessed by animal
		
		Animal sparrow1=new Sparrow("Mi",1);
		sparrow1.hasName();
		//sparrow1.fly(); compile time error
		
		Bird sparrow2=new Sparrow("Kia",2);
		sparrow2.hasName();
	}

}
