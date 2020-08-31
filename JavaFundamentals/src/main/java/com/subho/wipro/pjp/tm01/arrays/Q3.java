package com.subho.wipro.pjp.tm01.arrays;

import java.util.Arrays;

public class Q3 {
	 public static void main(String[] args) {
		 int[] arr = new int[] {1,4,34,56,7};
		 int searchNumber = 56;
		 int result = Arrays.binarySearch(arr, searchNumber);
		 if (result < 0) {
			System.out.println("-1");
		 }
		 else {
			 System.out.println(result + 1);
		 }
	 }
 }