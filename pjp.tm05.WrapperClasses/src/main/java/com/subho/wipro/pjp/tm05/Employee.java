/**
 * Subhrodip Mohanta
 * hello@subho.xyz
 */
package com.subho.wipro.pjp.tm05;

/**
 * @author subho
 *
 */
public class Employee implements Cloneable {

	int empid;
	String dept;
	
	Employee toClone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return this;			
		}
	}
	
	public static void main(String[] args) {
		Employee obj1 = new Employee();
		obj1.empid = 15040;
		obj1.dept = "Cse";
		Employee obj2;
		obj2 = obj1.toClone();
		obj2.empid = 1600;
		obj2.dept = "IT";
		System.out.println("The original properties are: ");
		System.out.println("Employee id: " + obj1.empid);
		System.out.println("Department: " + obj1.dept);
		
		System.out.println("The Clone object properties are: ");
		System.out.println("Employee id: " + obj2.empid);
		System.out.println("Department: " + obj2.dept);
	}
}
