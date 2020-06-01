package com.subho.wipro.pjp.tm01.arrays;

public class Q14 {

	public static void main(String[] args) {
		int i;
		int j;
		int k=0;
		int max = -1;
		try {
			if(args[8].length()==0)
			{}
			else
			{
				int[][] arr = new int[3][3];
				for(i=0;i<3;i++)
				{
					for(j=0;j<3;j++)
					{
						arr[i][j]=Integer.parseInt(args[k++]);
						if(arr[i][j]>max)
							max = arr[i][j];
						System.out.print(arr[i][j]+" ");
					}System.out.println();
				}
				System.out.println("The biggest numbre in the given array is "+max);
			}
		}catch(Exception e)
		{
			System.out.println("Please Enter 9 integer numbers");
		}

	}

}
