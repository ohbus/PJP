package com.subho.wipro.pjp.tm03.proj;

public class RDAccount extends Account {
	
	double interestRate;
	int ageOfAcHolder;
	int noOfMonths;
	double monthlyAmount;
	
	public RDAccount(int ageOfAcHolder, int noOfMonths, double monthlyAmount) {
		this.ageOfAcHolder =  ageOfAcHolder;;
		this.noOfMonths = noOfMonths;
		this.monthlyAmount = monthlyAmount;
	}
	
	double calculateInterest() {
		if(noOfMonths == 6) {
			if(ageOfAcHolder >= 60)
				interestRate = 8.00;
			else
				interestRate = 7.50;
			
		}
		
		else if(noOfMonths == 9) {
			if(ageOfAcHolder >= 60)
				interestRate = 8.25;
			else
				interestRate = 7.75;
		}
		
		else if(noOfMonths == 12) {
			if(ageOfAcHolder >= 60)
				interestRate = 8.50;
			else
				interestRate = 8.00;
		}
		
		else if(noOfMonths == 15) {
			if(ageOfAcHolder >= 60)
				interestRate = 8.75;
			else
				interestRate = 8.25;
		}

		else if(noOfMonths == 18) {
			if(ageOfAcHolder >= 60)
				interestRate = 9.00;
			else
				interestRate = 8.50;
		}
		
		else if(noOfMonths == 21) {
			if(ageOfAcHolder >= 60)
				interestRate = 9.25;
			else
				interestRate = 8.75;
		}

		return ((monthlyAmount * interestRate )/100);
	}
}
