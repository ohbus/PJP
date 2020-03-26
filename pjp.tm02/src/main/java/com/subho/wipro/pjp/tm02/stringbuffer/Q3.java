package com.subho.wipro.pjp.tm02.stringbuffer;

public class Q3 {
	
	public static void main(String[] args) {
		String str = args[0];
		int n = str.length();
		String sub = str.substring(0,2);
		String sub1 = "";
		for(int i = 0; i < n; ++i) {
			sub1 = sub1 + sub;
		}
		System.out.println(sub1);
	}
}
