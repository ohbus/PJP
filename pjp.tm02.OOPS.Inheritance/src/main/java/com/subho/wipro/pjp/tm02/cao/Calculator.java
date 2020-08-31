package com.subho.wipro.pjp.tm02.cao;

public class Calculator {
	
	public static double powerInt(int num1, int num2) {
		return Math.pow(num1, num2);
	}
	
	public static double powerDouble(double num1, int num2) {
		return Math.pow(num1,  num2);
	}
	
	public static void main(String[] args) {
		System.out.println("Output of powerInt is: " + Calculator.powerInt(2,  3));
		System.out.println("Output of powerDouble is: " + Calculator.powerDouble(2.5,  3));
	}
}
