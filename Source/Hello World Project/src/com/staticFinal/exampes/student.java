package com.staticFinal.exampes;

public class student {
	private String studentName;
	private static String schoolName;
	public String stuName="Public School Name";
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public static String getSchoolName() {
		return schoolName;
	}
	public static void setSchoolName(String schoolName) {
		student.schoolName = schoolName;
	}
	
}
