/**
 * Subhrodip Mohanta
 * hello@subho.xyz
 */
package com.subho.wipro.pjp.tm05;

import java.util.Scanner;

/**
 * @author subho
 *
 */
public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		String binaryNum = Integer.toBinaryString(number);
		int length = binaryNum.length(); // to calculate no of digits in binary number
		if(length < 8 ) {
			for(int i = length; i < 8; ++i ) {
				System.out.print("0");
			}
		}
		System.out.print(binaryNum);
		sc.close();
	}
}