package com.subho.wipro.pjp.tm02.stringbuffer;

public class Q2 {
	
	public static void main(String[] args) {
		
		String str1 = args[0];
		String str2 = args[1];
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		Character ch1 = str1.charAt(str1.length() - 1);
		Character ch2 = str2.charAt(0);
		
		if(ch1.equals(ch2)) {
			str2 = str2.replaceFirst(ch2.toString(), "");
		}
		
		System.out.println(str1+str2);
	}
}