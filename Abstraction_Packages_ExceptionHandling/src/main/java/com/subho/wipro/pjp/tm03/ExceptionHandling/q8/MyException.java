package com.subho.wipro.pjp.tm03.ExceptionHandling.q8;

public class MyException extends Exception{
	
	public MyException() {
		System.out.println("Exception");
	}
	
	public String toString() {
		return "Sorry the age you have entered is not in the range of 18 and 60.";
	}
	
}
