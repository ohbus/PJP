package com.subho.wipro.pjp.tm02.polymorphism.q2;

public class Circle extends Shape{
	
	//@override
	public void draw() {
		System.out.println("Drawing Circle.");
	}
	
	//@override
	public void erase() {
		System.out.println("Erasing Circle");
	}
}
