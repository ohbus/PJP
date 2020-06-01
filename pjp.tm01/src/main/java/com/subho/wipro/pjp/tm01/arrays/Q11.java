package com.subho.wipro.pjp.tm01.arrays;

public class Q11 {

	public static void main(String[] args) {
		int[] arr = new int[] {1,4,1,4};
		int flag = 0 ;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=1 && arr[i]!=4)
				flag = 1;
		}
		if(flag==0)
			System.out.println("true");
		else
			System.out.println("false");

	}

}
