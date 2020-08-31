package com.subho.wipro.pjp.tm02.stringbuffer;

public class Q11 {
	
	public static void main(String[] args) {
		
		String a = "abcXY123XYijk";
		String b = "XY";
		String str = "";
		String finalString = "";
		
		if(a.toLowerCase().contains(b.toLowerCase()) == false) {
			System.out.println("Substring not present");
		}
		else {
			str = a.replaceAll(b, "*");
		}
		
		for(int i = 0; i < str.length(); ++i) {
			if(str.charAt(i) == '*') {
				if(i-1 >= 0) {
					finalString = finalString + str.charAt(i-1);
				}
				
				if(i+1 <= str.length()-1) {
					finalString = finalString + str.charAt(i + 1);
				}
			}
		}
		System.out.println(finalString);
	}
}
