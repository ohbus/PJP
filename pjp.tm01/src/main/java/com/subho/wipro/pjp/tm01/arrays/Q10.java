package com.subho.wipro.pjp.tm01.arrays;

import java.util.Arrays;

public class Q10 {
	 public static void main(String[] args) {
		if(args.length == 9) {
			
			int arr[][] = new int[3][3];
			int c = 0;
			
			for(int i = 0; i < 3; ++i) {
				for(int j = 0; j < 3; ++j) {
					arr[i][j] = Integer.parseInt(args[c]);
					++c;
				}
			}
			System.out.println("The given array is :");
			for(int i = 0; i < 3; ++i) {
				for(int j = 0; j < 3; ++j) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
			int[] a = new int[9];
			
			for(int i = 0; i < 9; ++i) { 
				a[i] = Integer.parseInt(args[i]);
			}
			
			Arrays.sort(a);
			int max_number = a[a.length-1];
			System.out.println("The biggest number in the given array is " + max_number);
		}
		
		else {
			System.out.println("Please enter 9 integer numbers");
		}
	
	 }
}