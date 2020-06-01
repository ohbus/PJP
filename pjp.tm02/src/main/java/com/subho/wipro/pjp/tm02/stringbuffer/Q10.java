package com.subho.wipro.pjp.tm02.stringbuffer;

public class Q10 {
	
	public static void main(String[] args) {
		String str = "Wipro";
		int n =3;
		
		String sub = str.substring(str.length()-n, str.length());
		String finalString = "";
		for(int i = 0; i < n; ++i) {
			finalString = finalString + sub;	
		}
		
		System.out.println(finalString);
	}
}
