package com.subho.wipro.pjp.tm02.cao;

public class Patient {
	
	String patientName;
	double height;
	double weight;
	
	Patient(String patientName, double height, double width){
		this.patientName = patientName;
		this.height = height;
		this.weight = width;
	}
	
	public double computeBMI() {
		return weight / height;
	}
	
	public static void main(String[] args) {
		Patient obj1 = new Patient("Abc", 1.2, 65);
		System.out.println("The BMI of the patient is " + obj1.computeBMI());
	}
}
