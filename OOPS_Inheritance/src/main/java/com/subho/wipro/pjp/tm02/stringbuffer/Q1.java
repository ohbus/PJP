package com.subho.wipro.pjp.tm02.stringbuffer;

public class Q1 {
	
	public static void main(String[] args) {
		String str = args[0];
		StringBuffer stb = new StringBuffer(str);
		stb = stb.reverse();
		String str2 = stb.toString();
		if(str.equals(str2)) {
			System.out.println("Palindrome");
		}
		
		else
			System.out.println("Not Palindrome");
	} 
}