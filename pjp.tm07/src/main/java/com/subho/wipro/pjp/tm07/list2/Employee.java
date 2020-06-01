package com.subho.wipro.pjp.tm07.list2;

public class Employee {

	int empid;
	String empname;
	String email;
	String gender;
	float salary;
	
	void getemployeeDetails() {
		System.out.println("Employee id is: " + empid);
		System.out.println("Employee name is: " + empname);
		System.out.println("Employee email is: " + email);
		System.out.println("Employee gender is: " + gender);
		System.out.println("Salary of employee is: " + salary);
	}

}