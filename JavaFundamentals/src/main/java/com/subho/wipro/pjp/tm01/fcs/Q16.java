package com.subho.wipro.pjp.tm01.fcs;

public class Q16 {
	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("Please enter an integer number");
			return ;
		}

		else{
			int n = Integer.parseInt(args[0]);
			for(int i = 1; i <=n ; ++i){
				for(int j = 1; j <= i; ++j){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}