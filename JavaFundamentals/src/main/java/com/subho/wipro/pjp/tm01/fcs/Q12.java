package com.subho.wipro.pjp.tm01.fcs;

public class Q12 {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		boolean flag = false;
		for(int i = 2; i <= number/2; ++i ){
			if(number % i == 0){
				flag = true;
				break;
			}
		}
		if (!flag)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
	}
}
