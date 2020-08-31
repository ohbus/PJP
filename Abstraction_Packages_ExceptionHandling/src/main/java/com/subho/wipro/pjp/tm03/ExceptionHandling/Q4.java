/**
 * Subhrodip Mohanta
 * hello@subho.xyz
 */
package com.subho.wipro.pjp.tm03.ExceptionHandling;

/**
 * @author subho
 *
 */

public class Q4 {

	public static void main(String[] args) {
		try {
			int[] arr = new int[] {Integer.parseInt(args[0]),Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4])};
			int sum =0;
			for(int i =0 ; i < arr.length; ++i) {
				sum  = sum + arr[i];
			}
			
			double average = 0;
			try {
				average = sum/ 5;
			} catch (ArithmeticException e) {
				e.printStackTrace();
				return ;
			}
			
			System.out.println("Sum = " + sum);
			System.out.println("Average = " + average);
		}
		
		catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
}