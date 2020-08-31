package com.subho.wipro.pjp.tm02.polymorphism.q2;

public class Triangle extends Shape{
	
	//@override
	public void draw() {
		System.out.println("Drawing Triangle.");
	}
	
	//@override
	public void erase() {
		System.out.println("Erasing Triangle");
	}
}
