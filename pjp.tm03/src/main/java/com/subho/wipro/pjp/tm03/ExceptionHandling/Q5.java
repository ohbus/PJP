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

public class Q5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		try {
			System.out.println(num1/num2);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
