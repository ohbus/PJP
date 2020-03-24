package com.subho.wipro.pjp.tm01.fcs;

import java.util.*;

public class Q1{
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number > 0)
			System.out.println("Number is Positive.");
		else if(number < 0)
			System.out.println("Number is Negative");
		else
			System.out.println("Number is zero");
		sc.close();
	}
}