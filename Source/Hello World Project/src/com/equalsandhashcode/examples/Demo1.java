package com.equalsandhashcode.examples;

public class Demo1 {

	public static void main(String[] args) {
		String s1="Batman";
		String s2=new String("Batman");
		String s3="Batman";
		String s4=new String("Batman");
		
		System.out.println("== cases");
		if(s1==s3)
			System.out.println("S1 &S3 are Equal");
		else
			System.out.println(" S1 &S3 are Not equal");
		
		System.out.println();
		if(s1==s4)
			System.out.println("S1 &S4 are Equal");
		else
			System.out.println("S1 &S4 are Not equal");
		
		System.out.println();
		if(s2==s4)
			System.out.println("S2 &S4 are Equal");
		else
			System.out.println("S2 &S4 are Not equal");
		
		System.out.println();
		if(s2==s3)
			System.out.println("S2 &S3 are Equal");
		else
			System.out.println("S2 &S3 are Not equal");
		
		System.out.println("----------");
		System.out.println("Using equals()");
		if(s1.equals(s3))
			System.out.println("S1 &S3 are Equal");
		else
			System.out.println(" S1 &S3 are Not equal");
		
		System.out.println();
		if(s1.equals(s4))
			System.out.println("S1 &S4 are Equal");
		else
			System.out.println("S1 &S4 are Not equal");
		
		System.out.println();
		if(s2.equals(s4))
			System.out.println("S2 &S4 are Equal");
		else
			System.out.println("S2 &S4 are Not equal");
		
		System.out.println();
		if(s2.equals(s3))
			System.out.println("S2 &S3 are Equal");
		else
			System.out.println("S2 &S3 are Not equal");
		
		//equals in case of string comparison checks if each alphabet is same is not hence returns true even if 
		// they are located in different locations.
				
		//equals in case of object comparison checks again uses == in its implementation hence returns true only if 
		// they are located in same location.
		

	}

}
