package com.subho.wipro.pjp.tm07.list2;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {

	ArrayList<Employee> al = new ArrayList<Employee>();
	
	boolean addEmployee(Employee e) {
		al.add(e);
		System.out.println("\n");
		return true;
		
	}
	
	boolean deleteEmployee(int empid) {
		Iterator<Employee> i = al.iterator();   
		while(i.hasNext()) {
			if(i.next().empid == empid) {
				i.remove(); 
				System.out.println("Employee Removed.");
				System.out.println(al.get(0).empid);
				break;
			}
			else {
				System.out.println("Employee not found.");
			}
		}
		return true;
		
	}
	
	String showPaySlip(int empid) {
		Iterator<Employee> i = al.iterator();
		while(i.hasNext()) {
			Employee temp = i.next();
			if(temp.empid == empid) {
				return "Payslip of the employee is: " + temp.salary;
			}
		}
		return "Employee not found.";
	}
}
