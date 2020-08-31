package com.subho.wipro.pjp.tm02.inheritance.q3;

public class Student extends Person{
	
	String student_name;
	String student_age;
	
	Student(String student_name, String dob){
		super(student_name,dob);
		this.student_age = dob;
		this.student_name = student_name;
	}
}