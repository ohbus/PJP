package com.subho.wipro.pjp.tm02.stringbuffer;

public class Q4 {
	public static void main(String[] args) { 
		
		String str = "TomCat";
		int length = str.length();
		
		if(length % 2 != 0)
			System.out.println("null");
		
		else {
			System.out.println(str.substring(0,length/2));
		}
	}
}