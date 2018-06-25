package com.generics.examples;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List<Student> lst=new ArrayList<Student>();
		//implemented generics to ensure type safety;hence we can check for errors in compile time itself 
		
		lst.add(new Student());
		lst.add(new Student());
		lst.add(new Student());
		lst.add(new Student());
//		lst.add(new Machine());
//		lst.add("Yo");
//		lst.add(1111);
//		lst.add(new Machine());
//		lst.add(new Machine());
		//here the add method is expecting only student object
		
		Student std=lst.get(0);//since we already used generics no need of type casting.get() will always return student.
		System.out.println("std value is "+std.toString());
		
		//whenever we try to print an object toString() is called by default
		
		//Integer i=(Integer) lst.get(1);//compile time error since generics are used.
		//System.out.println("integer value is "+i.toString());
		
		List<Integer> intLst=new ArrayList<Integer>();
		intLst.add(4);
		//intLst.add("Yo"); only takes integer.

	}

}
