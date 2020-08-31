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

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		boolean flag = true;
		
		System.out.println("Enter the elements of the array.");
		for(int i = 0; i < size; ++i) {
			try {
				arr[i] =  sc.nextInt();
			} catch (Exception  e) {
				System.out.println(e);
				System.exit(0);
			}
		}
		
		System.out.println("Enter the index of the array element you want to access.");
		int index = sc.nextInt();
		
		try {
			System.out.println("The array element at index " +index + " = " + arr[index]);
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			flag = false;
		}
		
		if(flag == true) {
			System.out.println("The array element successfully accessed.");
		}
		
		sc.close();
	}
	
}