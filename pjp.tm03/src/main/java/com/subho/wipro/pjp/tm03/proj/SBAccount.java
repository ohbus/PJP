package com.subho.wipro.pjp.tm03.proj;

public class SBAccount extends Account {
	
	double interestRate;
	double amount ;
	String type;
	
	public SBAccount(String type, double amount) {
		this.amount = amount;
		this.type = type;
	}
	
	double calculateInterest() {
		
		double interest;
		
		if(type.equals("Normal")) {
			interestRate = 4 ;
			interest = (amount * interestRate)/100;
		}
		
		else {
			interestRate = 6;
			interest = (amount * interestRate)/100;
		}
		
		return interest;
	}
}