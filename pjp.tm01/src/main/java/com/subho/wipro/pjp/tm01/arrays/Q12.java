package com.subho.wipro.pjp.tm01.arrays;

public class Q12 {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3};
		int[] arr1 = new int[] {4,5,6};
		
		int[] res= new int[] {(arr[arr.length/2]),(arr1[arr1.length/2])};
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+" ");
	}

}
