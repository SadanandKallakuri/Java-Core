package com.comparisons.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		
		lst.add(12);
		lst.add(34);
		lst.add(52);
		lst.add(30);
		lst.add(1);
		lst.add(45);
		
		for(Integer i:lst)
			System.out.println("The value is "+i);
		
		System.out.println("After Sorting--");
		Collections.sort(lst);
		for(Integer i:lst)
			System.out.println("The value is "+i);

	}

}
