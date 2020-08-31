package com.subho.wipro.pjp.tm03.ExceptionHandling.q8;

public class Q8 {

	public static void main(String[] args) {
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		
		try {
			if(age <18 || age > 60) {
				throw new MyException() ;
			}
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
	
}