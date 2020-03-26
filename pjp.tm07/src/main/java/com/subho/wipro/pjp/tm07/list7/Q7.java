package com.subho.wipro.pjp.tm07.list7;

import java.util.Iterator;
import java.util.Vector;

public class Q7 {
	public static void main(String[] args) {
		
		Vector<Employee> list = new Vector<Employee>();
		Employee obj1 = new Employee(1500, "Abhish", "abhish@gmail.com", "Male", 80000);
		Employee obj2 = new Employee(1200, "Aakash", "aakash@gmail.com", "Male", 90000);
		Employee obj3 = new Employee(1600, "Neha", "neha@gmail.com", "Female", 90070);
		
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
		Iterator<Employee> i = list.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			System.out.println();
		}
	}
}