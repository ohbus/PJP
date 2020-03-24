package com.subho.wipro.pjp.tm01.fcs;

public class Q13 {
	public static void main(String[] args) {
		boolean flag = false;
		for(int i = 10; i <= 99; ++i){
			for(int j = 2; j <= i/2; ++j){
				if(i % j == 0){
					flag = true;
					break;
				}
			}
			if (!flag)
            	System.out.println(i);
            flag = false;
		}
	}
}