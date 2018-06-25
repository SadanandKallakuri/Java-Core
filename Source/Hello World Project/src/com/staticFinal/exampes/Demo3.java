package com.staticFinal.exampes;

public class Demo3 {
	
	public int x;
	public static int y;
	
	public void m1() {
		
	}
	public static void m2() {
		
	}
	public void m3() {
		System.out.println(x);
		System.out.println(y);
		m1();
		m2();
	}
	public static void m4() {
		m2();
		System.out.println(y);
		//System.out.println(x);
		//m1();
		//Always static variables and methods are created first when a program is executed hence in any 
		//program, all the non static methods can access static variables and methods whereas the static methods
		//cannot access non static methods and variables.
		Demo3 d3=new Demo3();
		System.out.println(d3.x);
		d3.m2();
		//Anyway, we can use objects to access the static methods and variables.
		
	}

}
