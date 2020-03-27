package com.subho.wipro.pjp.tm03.ExceptionHandling.q6;

public class MyException extends Exception{
	
	public MyException() {
		System.out.println("Exception");
	}
	
	public String toString() {
		return "Oops! please enter the value in range of 0-100.";
	}
	
}
