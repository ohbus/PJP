/**
 * Subhrodip Mohanta
 * hello@subho.xyz
 */
package com.subho.wipro.pjp.tm03.ExceptionHandling.q6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author subho
 *
 */

public class Q6 {
	
	public static void main(String[] args) {
		int number1 = 0, number2 = 0, number3 = 0, number4 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the first student: ");
		String name1 = sc.nextLine();
		System.out.println("Enter the marks of the first and second subject: ");
		
		try {
			 number1 = sc.nextInt();
			 number2 = sc.nextInt();
			 
			 if(number1 < 1 || number1 > 100 || number2 < 1 || number2 >100) {
				 throw new MyException();
			 }
			 sc.nextLine();
		}
		
		catch(InputMismatchException e) {
			System.out.println("Oops! Please enter integer value only. ");
			System.exit(0);
		}
		
		catch(MyException e) {
			System.out.println(e);
			System.exit(0);
		}
		
		System.out.println("Enter the name id the second student: ");
		String name2 = sc.nextLine();
		System.out.println("Enter the marks of the first and second subject");
		
		 try {
			number3 = sc.nextInt();
			number4 = sc.nextInt();
			
			if(number3 < 1 || number3 > 100 || number4 < 1 || number4 >100) {
				 throw new MyException();
			 }
			
		} catch (InputMismatchException e) {
				System.out.println("OOps! please enter the integer value only.");
				System.exit(0);
			}
		 catch(MyException e) {
				System.out.println(e);
				System.exit(0);
			}
		 
		 System.out.println("Average of two students are: " + (number1 + number2 + number3 + number4) / 2.0);
	}
	
}
