package com.comparisons.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		Student s1=new Student(5,"Batman",29);
		Student s2=new Student(7,"Flash",22);
		Student s3=new Student(9,"Ironman",31);
		
		List<Student> lst=new ArrayList<Student>();
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		
		for(Student std:lst)
			System.out.println(std);
		
		System.out.println("After Sorting--By Id");
		Collections.sort(lst);//since we implemented comparable interface.sorted by ID.
		for(Student i:lst)
			System.out.println("The value is "+i);

		System.out.println("After Sorting--By age");
		Collections.sort(lst, new StudentAgeComparator());
		for(Student i:lst)
			System.out.println("The value is "+i);
		
		System.out.println("After Sorting--By name");
		Collections.sort(lst, new StudentNameComparator());
		for(Student i:lst)
			System.out.println("The value is "+i);
	}

}
