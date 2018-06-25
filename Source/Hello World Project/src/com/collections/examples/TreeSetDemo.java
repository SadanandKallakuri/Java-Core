package com.collections.examples;


import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// set is an interface hence we cannot create an object of type interface hence we use its concrete class of
		//TreeSet to create an object of type set.
		String s=null;
				Set set=new TreeSet();
				System.out.println("The size of Set is "+set.size());
				set.add(1);
				set.add(2);
				set.add(3);
				set.add(4);
				//set.add(new Student()); class cast exception
				//set.add("Name"); class cast exception
				//set.add(s); cannot store null values
				set.add(5);
				set.add(6);
				set.add(7);
				set.add(77);
				//set.add(s);
				set.add(8);
				set.add(9);
				set.add(10);
				set.add(11);
				set.add(12);
				//set.add(s);
				set.add(1);
				set.add(2);
				set.add(3);
				set.add(4);
				set.add(222);
				//set.add(s);
				set.add(5);
				set.add(6);
				set.add(7);
				//set.add(s);
				set.add(8);
				set.add(9);
				set.add(10);
				set.add(11);
				set.add(12);
				//set.add(s);
				
				System.out.println("The size of Set is "+set.size());
				
				for(Object se:set)
				System.out.println("The elements of Set is "+se);	
				
				//Tree set is sorted, cannot store null values, cannot store duplicate values.
				//Tree set is not ordered(cannot retrieve elements in the same order as we give them).
	
				//hence set can be used to find if duplicate elements are present or not.
				
				//since we never know the size of the set we cannot use get().
				
				//tree set expects the type of elements added to it to be of the same type as the first element added
				//to it.
				
				System.out.println("Can we add 111 into set now? "+set.add(111));
				System.out.println("Can we add 111 into set now? "+set.add(111));
}
}
