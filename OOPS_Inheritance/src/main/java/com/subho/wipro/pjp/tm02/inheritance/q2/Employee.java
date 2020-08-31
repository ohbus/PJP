package com.subho.wipro.pjp.tm02.inheritance.q2;

public class Employee extends Person {
	
	double salary;
	int year;
	String insurance_number;
	
	Employee(String name, double salary, int year, String insurance_number){
		super(name);
		this.salary = salary;
		this .year = year;
		this.insurance_number = insurance_number;
	}
	
	void display() {
		System.out.println("Employee name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Year of joining: " + year);
		System.out.println("Insurance_number: " + insurance_number);
	}
}
