package com.collections.examples;


import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// set is an interface hence we cannot create an object of type interface hence we use its concrete class of
		//HashSet to create an object of type set.
		String s=null;
				Set set=new HashSet();
				System.out.println("The size of Set is "+set.size());
				set.add(1);
				set.add(2);
				set.add(3);
				set.add(4);
				set.add(s);
				set.add(5);
				set.add(6);
				set.add(7);
				set.add(s);
				set.add(8);
				set.add(9);
				set.add(10);
				set.add(11);
				set.add(12);
				set.add(s);
				set.add(1);
				set.add(2);
				set.add(3);
				set.add(4);
				set.add(s);
				set.add(5);
				set.add(6);
				set.add(7);
				set.add(s);
				set.add(8);
				set.add(9);
				set.add(10);
				set.add(11);
				set.add(12);
				set.add(s);
				
				for(Object se:set)
				System.out.println("The elements of Set is "+se);	
				
				//set is not sorted, can store null value(only one), cannot store duplicate values
				//set is not ordered(cannot retrieve elements in the same order as we give them)
	
				//hence set can be used to find if duplicate elements are present or not
				
				//since we never know i the size of the set we cannot use get()
				
				System.out.println("Can we add 111 into set now? "+set.add(111));
				System.out.println("Can we add 111 into set now? "+set.add(111));
}
}
