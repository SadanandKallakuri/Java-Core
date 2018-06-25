package com.inheritance;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//parent class
		simpleInheritance s1= new simpleInheritance();
		s1.hasProperty();
		s1.hasLand();
		s1.hasMoney(2500);
		
		//child class
		childClass c1= new childClass();
		c1.hasCar();
		c1.hasLand();
		//inherited methods
		c1.hasProperty();
		c1.hasMoney(3000);
		
		//dynamic polymorphism, accessing child class methods using parent class reference
		simpleInheritance s2= new childClass();
		s2.hasLand();
		s2.hasMoney(3400);
		
		childClass c2= new grandChild();
		c2.hasLand();
		c2.hasCar();
		
		
		
		//ClassCastException
		//childClass c2= (childClass) new simpleInheritance();
		//c2.hasLand();
		
		//multilevel polymorphism
		grandChild gc1= new grandChild();
		gc1.hasMoney(98);
		gc1.hasCar();
		gc1.hasLand();
		gc1.hasPhone();
		

	}

}
