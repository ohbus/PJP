package com.subho.wipro.pjp.tm02.inheritance.q3;

public class Teacher extends Person {
	  double salary;
	  String subject;
	  
	  Teacher(String name, String dob, double salary, String subject){
		  super(name, dob);
		  this.salary = salary;
		  this.subject = subject;
		 	  
	  }
	  
	  public void show() {
		  System.out.println("Teacher name is: " + name);
		  System.out.println("Teacher age is: " +dob);
		  System.out.println("Salary is: " + salary);
		  System.out.println("Subject is " + subject);
	  }
	}