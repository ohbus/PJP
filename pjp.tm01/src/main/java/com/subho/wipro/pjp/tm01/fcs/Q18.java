package com.subho.wipro.pjp.tm01.fcs;

public class Q18 {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int temp = number;
		int res = 0;
		while(temp>0){
			int rem = temp % 10;
			res = res*10 + rem;
			temp /= 10;
		}
		if(number == res)
			System.out.println(temp+ " is a palindrome");
		else
			System.out.println(temp+ " is not a palindrome");
	}
} 