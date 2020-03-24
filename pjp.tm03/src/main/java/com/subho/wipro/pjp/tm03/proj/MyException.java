package com.subho.wipro.pjp.tm03.proj;

public class MyException extends Exception {
	
	int i;
	public MyException(int i) {
		this.i = i;
	}
	
	public String toString() {
		if(i == 1) {
			return "Invalid amount. Please enter non-negative value.";
		}
		
		else if(i == 2) {
			return "Invalid option. Please enter non-negative value.";
		}
		
		else if(i == 3) {
			return "Invalid no of days. Please enter non-negative value.";
		}
		else {
			return "Invalid age. Please enter non negative value. ";
		}
	}
	
}