package com.subho.wipro.pjp.tm03.AbstractClasses.q1;

public class Banking {

	public static void main(String[] args) {
		ICICIBank i = new ICICIBank();
		KotMBank k = new KotMBank();
		GeneralBank g = i;
		System.out.println("ICICI Bank : ");
		System.out.println("Savings Interest rate : "+g.getSavingsInterestRate());
		System.out.println("Fixed Deposit Interest rate : "+g.getFixedDepositInterestRate());
		
		g = k;
		System.out.println("Kotak Mahindra Bank : ");
		System.out.println("Savings Interest rate : "+g.getSavingsInterestRate());
		System.out.println("Fixed Deposit Interest rate : "+g.getFixedDepositInterestRate());
		
	}

}
