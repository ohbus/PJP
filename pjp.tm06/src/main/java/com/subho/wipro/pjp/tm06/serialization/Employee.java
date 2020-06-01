/**
 * 
 */
package com.subho.wipro.pjp.tm06.serialization;

import java.io.Serializable;
import java.util.Date;

/**
 * @author subho
 *
 */

public class Employee implements Serializable {

	String name;
	Date dateOfBirth;
	String department;
	String designation;
	double salary;
	
	public Employee() {
		;
	}
	
	public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.designation = designation;
		this.salary = salary;
		this.department = department;
	}
		
	public void setName(String name) {
		this.name = name;
	}
	
	public void setdateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	//get methods
	
	public  String getName() {
		return name;
	}
	
	public Date getdateOfBirth() {
		return dateOfBirth;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public double getSalary() {
		return salary;
	}	
	
	public String toString() {
		return "\nThe name of the employee is: " + getName() + "\nThe date of birth is :" + getdateOfBirth() + "\nThe department name is:" + getDepartment() + "\nThe designation is " + getDesignation() + "\nThe salary is: " + getSalary();
	}
	
}
