package com.subho.wipro.pjp.tm01.arrays;

public class Q9 {
	 public static void main(String[] args) {
		 int[][] arr = new int[2][2];
		 int c = 0;
		if (args.length == 4) {
			for (int i = 0; i < 2; ++i) {
				for (int j = 0; j < 2; ++j) {
					arr[i][j] = Integer.parseInt(args[c]);
					++c;
				}
			}
			
			for(int i = 0; i < 2; ++i) {
				for(int j = 0; j < 1; ++j) {
					int temp = arr[i][j];
					arr[i][j] = arr[i][j+1];
					arr[i][j+1] = temp;
				}
			}
			for(int i = 0; i < 1; ++i) {
				for(int j = 0; j < 2; ++j) {
					int temp = arr[i][j];
					arr[i][j] = arr[i+1][j];
					arr[i+1][j] = temp;
				}
			}
			for(int i = 0; i < 2; ++i)
			{
				for(int j = 0; j < 2; ++j)
					System.out.print(arr[i][j]);
				
				System.out.println();
			}
			System.out.println();
		}
		else {
			System.out.println("Please enter 4 integer numbers");
		}
	 }
}