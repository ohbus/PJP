package com.subho.wipro.pjp.tm01.fcs;

public class Q6 {
	public static void main(String[] args) {
		String gender = args[0];
		int age = Integer.parseInt(args[1]);

		if("Male".equals(gender)){
			if(age >= 1 && age <= 58)
				System.out.println("8.4%");
		}
		else{
			if(age >= 1 && age <= 58)
				System.out.println("8.2%");
			else if(age >=59 && age <= 100)
				System.out.println("9.2%");
		}	
	}
		
}
