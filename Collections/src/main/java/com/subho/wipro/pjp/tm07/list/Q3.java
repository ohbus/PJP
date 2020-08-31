package com.subho.wipro.pjp.tm07.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Q3 {
	static ArrayList<String> al = new ArrayList<String>();
	
	public static void printAll() {
		Iterator<String> i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
		
	public static void main(String[] args) {
		al.add("Hello");
		al.add("How are you?");
		al.add("Ok");
		al.add("Hello World");
		printAll();
	}
}