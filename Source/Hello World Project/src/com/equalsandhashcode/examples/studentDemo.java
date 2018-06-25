package com.equalsandhashcode.examples;

import java.util.HashMap;
import java.util.Map;

public class studentDemo {

	public static void main(String[] args) {
		Student s1=new Student(5,"Batman",29);
		Student s2=new Student(5,"Batman",29);
		Student s3=new Student(5,"Batman",29);
		Student s4=new Student(6,"Flash",25);
		
		if(s1==s2)
			System.out.println("Same Location");
		else
			System.out.println("Different Location");
		
		if(s1.equals(s2))
			System.out.println("Same Data");
		else
			System.out.println("Different Data");
		
		//equals in case of string comparison checks if each alphabet is same is not hence returns true even if 
		// they are located in different locations.
		
		//equals in case of object comparison checks again uses == in its implementation hence returns true only if 
		// they are located in same location.
		
		Map map=new HashMap();
//		map.put(1, "Batman");
//		map.put(1, "Flash");
//		System.out.println("Size of map is "+map.size());
//		System.out.println("Element in map is "+map.get(1));
		
		System.out.println("HashCode of s1 is"+s1.hashCode());
		System.out.println("HashCode of s2 is"+s2.hashCode());
		System.out.println("HashCode of s3 is"+s3.hashCode());
		System.out.println("HashCode of s4 is"+s4.hashCode());
		
		//if the hashcode() is not overriden, the hashcodes of all the objects would have been different.
		//in case we override hashcode(), then s1,s2,s3's hashcodes would be same as they have same elements.
		
		map.put(s1, "Batman");
		map.put(s2, "Flash");
		map.put(s4, "Iron Man");
		System.out.println("Size of map is "+map.size());//returns 2, as it considers s1&s2 are 2 different objects
		//but we saw that data is same in above comparison
		
		//if the hashcode() is not overriden, the hashcodes of all the objects would have been different hence size=2.
		 
		//in case we override hashcode(), then s1,s2,s3's hashcodes would be same as they have same elements 
		//hence size is 1.
		
		System.out.println("Element in map at key s1 is "+map.get(s1));
		System.out.println("Element in map at key s2 is "+map.get(s2));
		System.out.println("Element in map at key s3 is "+map.get(s3));
		System.out.println("Element in map at key s4 is "+map.get(s4));
		
		//if the hashcode() is not overriden, the hashcodes of all the objects would have been different,hence output
		//will be different for all the elements.
		
		//in case we override hashcode(), then s1,s2,s3's hashcodes would be same as they have same elements
		//hence ouptuts for s1,s2,s3 would be flash and null for remaining.
		

	}

}
