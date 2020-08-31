package com.subho.wipro.pjp.tm01.arrays;

public class Q13 {

	public static void main(String[] args) {
		int[][] arr = new int[2][2];
		int[][] arr1 = new int[2][2];
		int i;
		int j;
		try {
			if(args[3].length()==0)
				System.out.println("Please enter 4 integer numbers");
			else
			{
				arr[0][0] = Integer.parseInt(args[0]);
				arr[0][1] = Integer.parseInt(args[1]);
				arr[1][0] = Integer.parseInt(args[2]);
				arr[1][1] = Integer.parseInt(args[3]);
				System.out.println("The given array is : ");
				for(i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
						System.out.print(arr[i][j]+" ");
					}System.out.println();
				}
				for(i=1;i>=0;i--)
				{
					for(j=1;j>=0;j--)
					{
						arr1[2-1-i][2-1-j]= arr[j][i];
					}
				}
			
				System.out.println("The given array is : ");
				for(i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
						System.out.print(arr1[i][j]+" ");
					}System.out.println();
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Please enter 4 integer numbers");
		}
	}
}
