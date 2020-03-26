package com.subho.wipro.pjp.tm02.stringbuffer;

public class Q6 {
	public static void main(String[] args) {
		
		String s1 = "hi";
		String s2 = "hello";
		
		if(s1.length() == s2.length())
			System.out.println("Length of both strings should be different.");
		
		else {
			String small, large;
			if(s1.length() < s2.length()) {
				small = s1;
				large = s2;
			}	
			
			else {
				small = s2;
				large = s1;
			}
			
			System.out.println(small + large + small);
		}
	}
}
