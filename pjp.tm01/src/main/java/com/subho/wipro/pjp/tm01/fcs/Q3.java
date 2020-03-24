package com.subho.wipro.pjp.tm01.fcs;

public class Q3 {
	public static void main(String[] args) {
		int len = args.length;
		if(len == 0){
			System.out.println("No values");
		}
		else{
			for(int i=0; i<=len-1; ++i){
				if(i == len-1){
					System.out.println(args[i]);
				}
				else{
					System.out.print(args[i]+ ",");
				}
			}
		}
	}
}