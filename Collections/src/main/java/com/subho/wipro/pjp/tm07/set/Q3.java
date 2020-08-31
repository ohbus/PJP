package com.subho.wipro.pjp.tm07.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Q3 {
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Apple");
		tree.add("Dell");
		tree.add("Hp");
		tree.add("Razor");
		tree.add("Asus");
		tree.add("Acer");
		TreeSet<String> reverseTree = new TreeSet<String>();
		reverseTree = (TreeSet<String>) tree.descendingSet();
		
		
		Iterator<String> i= tree.iterator();
		Iterator<String> j = reverseTree.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		
		String find = "Razor";
		boolean flag = false;
		
		i= tree.iterator();
		
		while(i.hasNext()) {
			if(i.next().equals(find)) {
				flag = true;
				break;
			}
		}
		System.out.println();
		if(flag == true) {
			System.out.println("Element exists in the set.");
		}
		else {
			System.out.println("Element does not exists in the set ");
		}		
		
	}
}