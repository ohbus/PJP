package com.subho.wipro.pjp.tm01.arrays;

public class Q7 {
	 public static void main(String[] args) {
		 int[] arr = new int[] {12,34,12,45,67,89};
		 int[] arr2 = new int[arr.length];
		 
		 for(int i = 0; i < arr.length; ++i) {
			 for(int j = i+1; j < arr.length; ++j) {
				 if(arr[i] == arr[j]) {
					 arr[j] = -1;
				 }
			 }
		 }
		 int j = 0;
		 for(int i = 0; i < arr.length; ++i) {
			 if(arr[i] != -1) {
				 arr2[j] = arr[i];
				 ++j;
			 }
		 }
		 for(int i = 0; i < j; ++i) {
			 System.out.println(arr2[i]);
		 }
	 }	 
 }