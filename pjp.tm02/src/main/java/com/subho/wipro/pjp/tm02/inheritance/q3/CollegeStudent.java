package com.subho.wipro.pjp.tm02.inheritance.q3;

public class CollegeStudent extends Student{
	
	int year;
	String major;
	
	CollegeStudent(String name, String age, int year, String major){
		super(name, age);
		this.year = year;
		this.major = major;
	}
	
	public void show() {
		System.out.println("The student name is: " + student_name);
		System.out.println("Age is: " + student_age);
		System.out.println("Year is: " + year);
		System.out.println("Major is: " + major);
	}

}