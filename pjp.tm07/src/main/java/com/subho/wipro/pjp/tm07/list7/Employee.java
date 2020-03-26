package com.subho.wipro.pjp.tm07.list7;

public class Employee {

	int empid;
	String empname;
	String email;
	String gender;
	float salary;
	
	public Employee(int empid, String empname, String email, String gender, float salary) {
		this.empid = empid;
		this.empname = empname;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee id: " + empid + "\nEmployee name: " + empname + "\nEmail: " + email + "\nGender: " + gender + "\nSalary: " + salary;
	}

}