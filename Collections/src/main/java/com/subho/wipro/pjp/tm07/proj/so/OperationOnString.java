package com.subho.wipro.pjp.tm07.proj.so;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class OperationOnString {

	LinkedList<String> list = new LinkedList<String>();
	
	public void insert(String str) {
		list.add(str);
		System.out.println("Inserted successfully.");
	}
	
	public void search(String str) {
		if(list.indexOf(str) == -1) {
			System.out.println("Item not found on the list.");
		}
		else {
			System.out.println("Item found on the list.");
		}
	}
	
	public void delete(String str) {
		if(list.indexOf(str) == -1) {
			System.out.println("Item does not exist.");
		}
		
		else {
			int index = list.indexOf(str);
			list.remove(index);
			System.out.println(" Deleted successfully");
		}
	}
	
	public void display() {
		Iterator<String> i = list.iterator();
		System.out.println("The items in the list are: ");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public static void main(String[] args) {
		OperationOnString obj = new OperationOnString();
		Scanner sc = new Scanner(System.in);

		
		while (true) {
			
			System.out.println("1. Insert\n2. Search\n3. Delete\n4. Display\n5. Exit");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				System.out.println("Enter the item to be inserted.");
				obj.insert(sc.nextLine());
				break;

			case 2:
				System.out.println("Enter the item to search:");
				obj.search(sc.nextLine());
				break;

			case 3:
				System.out.println("Enter the item to delete");
				obj.delete(sc.nextLine());
				break;

			case 4:
				obj.display();
				break;

			case 5:
				System.exit(0);
			}
		}
	}
}