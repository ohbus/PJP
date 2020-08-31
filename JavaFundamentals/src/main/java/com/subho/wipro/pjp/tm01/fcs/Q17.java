package com.subho.wipro.pjp.tm01.fcs;

public class Q17 {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int res = 0;
		while(number>0){
			int rem = number % 10;
			res = res*10 + rem;
			number = number / 10;
		}
		System.out.println(res);
	}
}
