package com.subho.wipro.pjp.tm01.fcs;

import java.util.*;

public class Q2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer number: ");
		int number = sc.nextInt();
		if(number % 2 == 0)
			System.out.println("Number is even.");
		else
			System.out.println("Number is odd.");
		sc.close();
	}
}