package com.subho.wipro.pjp.tm02.polymorphism.q2;

public class Square extends Shape{
	
	//@override
	public void draw() {
		System.out.println("Drawing Square.");
	}
	
	//@override
	public void erase() {
		System.out.println("Erasing Square");
	}
}
