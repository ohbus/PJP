package com.subho.wipro.pjp.tm01.arrays;

public class Q8 {
	 public static void main(String[] args) {
		int[] arr = new int[] {10,3,6,1,2,7,9} ;
		int six = -1;
		int seven = -1;
		int sum = 0;
		for(int i = 0; i < arr.length; ++i)
		{
			if(arr[i] == 6)
				six = i;
			else if(arr[i] == 7)
				seven = i;
		}
		if(six < seven && six != -1 || seven != -1)
		{
			for(int i = 0; i < arr.length; ++i)
			{
				if(i < six || i > seven) 
					sum = sum + arr[i];
				else
					continue;
			}
		}
		else
		{
			for(int i = 0; i < arr.length; ++i)
			{
				sum = sum + arr[i];
			}
		}
		
		System.out.println(sum);
	 }
}