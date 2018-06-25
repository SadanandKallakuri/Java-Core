package com.collections.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayListDemo2 {
	public static String s;

	public static void main(String[] args) {
		List list=new ArrayList();
		System.out.println("The size of ArrayList1 is "+list.size());
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(s);
		list.add(s);
		System.out.println("The size of ArrayList1 is "+list.size());
		System.out.println("The element of ArrayList1 at index 8 is "+list.get(8));
		System.out.println("The element of ArrayList1 is at index 9 is "+list.get(0));
		for(int i=0;i<list.size();i++) {
			System.out.println("The element of ArrayList at index " +i+ " is "+list.get(i));
		}
		//list is not sorted, can store null values, can store duplicate values
		//list is ordered(can retrieve elements in the same order as we give them)
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		System.out.println("The element of ArrayList is "+itr.next());
		
		//iterator is specifically used on collection objects
		//like in the set we cannot use get() so iterator is very useful in such cases
		
		System.out.println();
		//the output from list is of type Object
				for(Object obj:list)
				System.out.println("The element of Array is "+obj);
				
				System.out.println("The elements of Array are "+list);
		
	}

}
