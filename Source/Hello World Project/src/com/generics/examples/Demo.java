package com.generics.examples;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List lst=new ArrayList();
		
		lst.add(new Student());
		lst.add(new Student());
		lst.add(new Student());
		lst.add(new Student());
		lst.add(new Machine());
		lst.add(new Machine());
		lst.add(new Machine());
		//here the add method is expecting an object
		
		Student std= (Student) lst.get(0);//lst.get(0) gives us an object, hence to store that into a student object we use cast.
		//System.out.println("std value is "+std);
		System.out.println("std value is "+std.toString());
		
		//whenever we try to print an object toString() is called by default
		
		Integer i=(Integer) lst.get(1);//compiles but results in runtime error.
		System.out.println("integer value is "+i.toString());
		

	}

}
