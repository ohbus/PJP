package com.subho.wipro.pjp.tm02.stringbuffer;

public class Q8 {
	
	public static void main(String[] args) {
		String str = "ab*cd";
		StringBuffer stb = new StringBuffer(str);
		
		for(int i = 0; i< stb.length(); ++i) {
			char ch = stb.charAt(i);
			if(ch == '*') {
				stb.delete(i-1,i);
				stb.delete(i, i+1);
			}
		}
		str = stb.toString();
		str = str.replace("*", "");
		
		System.out.println(str);
	}
}
