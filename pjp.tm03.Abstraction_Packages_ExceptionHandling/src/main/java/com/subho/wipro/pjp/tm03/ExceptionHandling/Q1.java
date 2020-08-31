/**
 * Subhrodip Mohanta
 * hello@subho.xyz
 */
package com.subho.wipro.pjp.tm03.ExceptionHandling;

import java.util.Scanner;

/**
 * @author subho
 *
 */

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		boolean flag = true;
		int number = 0;
		
		try {
			number = sc.nextInt();
		}
		
		catch(Exception e) {
			System.out.println("Entered input is not a valid format for an integer.");
			flag = false;
		}
	
		
		if(flag == true) {
			System.out.println("The square value is " + number * number);
			System.out.println("The work has been done successfully.");
		}
		
		sc.close();
	}
	
}