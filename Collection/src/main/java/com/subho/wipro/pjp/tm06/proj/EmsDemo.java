/**
 * 
 */
package com.subho.wipro.pjp.tm06.proj;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author subho
 *
 */

public class EmsDemo {

	public static void main(String[] args)throws IOException {
		boolean flag = true;
		
		while (flag == true) {
			System.out.println("\n");
			System.out.println("Main Menu: ");
			System.out.println("1. Add an Employee: ");
			System.out.println("2. Display all");
			System.out.println("3. Exit");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1: int empId = 00;
					try {
					System.out.println("Enter Employee id: ");
						empId = sc.nextInt();
					} catch (Exception e) {
						System.out.println("Please enter an integer.");
						System.exit(0);						
					} 
					
					sc.nextLine();
					String name = " ";
					try {
						System.out.println("Enter Employee name: ");
						name = sc .nextLine();
					} catch (Exception e) {
						System.out.println("Please enter string value.");
					}
				int age = 0;
					try {
						System.out.println("Enter Employee age: ");
						age = sc.nextInt();
					} catch (Exception e) {
						System.out.println("Please enter integer value.");
					}
					sc.nextLine();
				double salary = 0;
					try {
						System.out.println("Enter Employee  salary: ");
						salary = sc.nextDouble();
					} catch (Exception e) {
						System.out.println("Please enter double value.");
					}
					Ems obj = new Ems();
					obj.entry(empId, name, age, salary);
					break;
					
			case 2: Ems obj1 = new Ems();
					System.out.println("========Report=========");
					obj1.display();
					System.out.println("=====End of Report=====");
					break;
			case 3: System.exit(0);		
					break;
					
			default: System.out.println("Wrong Input.");		
					
			}
			
			sc.close();
		}
	}
	
}