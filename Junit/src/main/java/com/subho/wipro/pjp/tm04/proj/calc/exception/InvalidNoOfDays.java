package com.subho.wipro.pjp.tm04.proj.calc.exception;

public class InvalidNoOfDays extends Exception{
	public InvalidNoOfDays()
	{
		super();
		System.out.println("Please Enter Valid No of Days/Month");
	}
}