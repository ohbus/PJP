package com.subho.wipro.pjp.tm01.fcs;

public class Q19 {
	public static void main(String[] args) {
		int count = 0;
		int i = 1;
		while(count < 5){
			if(i % 5 == 0 && i % 2 == 0 && i % 3 == 0 ){
				System.out.println(i);
				count ++;
			}
			++i;
		}
	}
}
