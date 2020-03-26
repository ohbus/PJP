package com.subho.wipro.pjp.tm07.list;

import java.util.Vector;

public class Q6 {
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>();
		list.add("January");
		list.add("February");
		list.add("March");
		list.add("April");
		list.add("May");
		list.add("June");
		list.add("July");
		list.add("August");
		list.add("September");
		list.add("October");
		list.add("November");
		list.add("December");
		
		for(String i : list) {
			System.out.println(i);
		}
	}
}