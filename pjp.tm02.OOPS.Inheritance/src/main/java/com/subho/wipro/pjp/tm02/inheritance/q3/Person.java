package com.subho.wipro.pjp.tm02.inheritance.q3;

public class Person {
	  String name;
	  String dob;
	  
	  Person(String paramString1, String paramString2) {
	    this.name = paramString1;
	    this.dob = paramString2;
	  }
	  
	  public String getName() {
	    return this.name;
	  }
	  
	  public String getDob() {
	    return this.dob;
	  }
}
