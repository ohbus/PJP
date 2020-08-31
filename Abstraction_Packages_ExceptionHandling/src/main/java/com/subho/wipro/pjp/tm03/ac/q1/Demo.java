package com.subho.wipro.pjp.tm03.ac.q1;

public class Demo {
	
	public static void main(String[] args) {
		
		ICICIBank i=new ICICIBank();
		KotMBank k=new KotMBank();
		
		System.out.println(i.getFixedDepositInterestRate());
		System.out.println(i.getSavingsInterestRate());
		
		System.out.println(k.getFixedDepositInterestRate());
		System.out.println(k.getSavingsInterestRate());
		
		GeneralBank g = new KotMBank();
		System.out.println(g.getFixedDepositInterestRate());
		System.out.println(g.getSavingsInterestRate());
		
		g = new ICICIBank();
		System.out.println(g.getFixedDepositInterestRate());
		System.out.println(g.getSavingsInterestRate());
		 
	}
}
