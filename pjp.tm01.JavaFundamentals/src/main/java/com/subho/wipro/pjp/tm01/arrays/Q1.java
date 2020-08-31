package com.subho.wipro.pjp.tm01.arrays;

public class Q1 {
	public static void main(String[] args) {
		int[] arr = new int[] {2,3,4,5,5,3};

		int sum = 0;

		for(int i = 0; i < arr.length; ++i){
			sum += arr[i];
		}

		System.out.println("Sum = "+sum);
		System.out.println("Avg = "+sum/arr.length);
	}
}