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

public class Q9 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the 2 numbers: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		try {
			System.out.println("The quotient of " + num1 + "/" + num2 + " = " + num1 / num2);
		}
		
		catch(Exception e) {
			System.out.println("DivideByZeroException caught.");
			//e.printStackTrace();
		}
		
		finally {
			System.out.println("Inside finally block.");
		}
		
		sc.close();
	}

}