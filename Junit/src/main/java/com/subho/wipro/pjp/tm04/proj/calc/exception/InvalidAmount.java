package com.subho.wipro.pjp.tm04.proj.calc.exception;

public class InvalidAmount extends Exception{
	public InvalidAmount()
	{
		super();
		System.out.println("Please Enter Valid Amount");
	}
}
