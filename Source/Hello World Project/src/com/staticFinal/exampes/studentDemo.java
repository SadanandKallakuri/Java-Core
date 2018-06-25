package com.staticFinal.exampes;

public class studentDemo {

	public static void main(String[] args) {
		student.setSchoolName("KVS");
		
		student.setSchoolName("HERMON");//doing this will overwrite the previous value stored in school name
		student s1=new student();
		System.out.println(s1.stuName);
		s1.setStudentName("Thor");
		System.out.println(s1.getStudentName());
		System.out.println(s1.getSchoolName());
//		another way of initializing school name but not preferred as it is a static variable.
//		s1.setSchoolName("KVS");
//		System.out.println(s1.getSchoolName());
		student s2=new student();
		System.out.println(s2.stuName);
		s2.setStudentName("Cap");
		System.out.println(s2.getStudentName());
		System.out.println(student.getSchoolName());
		student s3=new student();
		System.out.println(s3.stuName);
		s3.setStudentName("Bruce");
		System.out.println(s3.getStudentName());
		System.out.println(student.getSchoolName());
		student s4=new student();
		System.out.println(s4.stuName);
		s4.setStudentName("Tony");
		System.out.println(s4.getStudentName());
		System.out.println(student.getSchoolName());
		
		student.setSchoolName("HERMON");
		System.out.println(student.getSchoolName());
	}

}
