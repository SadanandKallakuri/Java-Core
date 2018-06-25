package com.collections.examples;

import java.util.*;

//import java.util.ArrayList;

public class arrayListDemo {

	public static void main(String[] args) {
		//ArrayList
		//ArrayList arrl=new ArrayList();
		
		// list is an interface hence we cannot create an object of type interface hence we use its concrete class of
		//arraylist to create an object of type list.

		List list=new ArrayList();
		List list1= new ArrayList(10);
		
		System.out.println("The size of ArrayList1 is "+list.size());
		System.out.println("The size of ArrayList2 is "+list1.size());
		
		list.add(12);
		list.add(new Student());
		
		Machine m1=new Machine();
		list.add(m1);
		
		int u=9;
		list.add(u);
		
		Integer v=9;
		list.add(v);
		
		
		System.out.println("The size of ArrayList1 is "+list.size());
		//although int is not an object still we are able to pass it by utilizing the concept of Boxing(int datatype 
		//is converted into Integer Class and Integer class is by default extends Object class). 
		
		
	}
	public void add(Object a,Object b) {
		
	}

}
