package com.subho.wipro.pjp.tm02.stringbuffer;

public class Q9 {
	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("Hello");
		StringBuffer b = new StringBuffer("World");
		
		int maxLength = Math.max(a.length(), b.length());
		StringBuffer finalString = new StringBuffer("");
		
		for(int i = 0; i < maxLength; ++i) {
			if(i < a.length())
				finalString.append(a.charAt(i));
			if(i < b.length())
				finalString.append(b.charAt(i));
		}
		
		System.out.println(finalString);
		
	}
}
