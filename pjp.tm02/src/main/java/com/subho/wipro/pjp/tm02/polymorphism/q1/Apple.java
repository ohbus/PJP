package com.subho.wipro.pjp.tm02.polymorphism.q1;

public class Apple extends Fruit {
	
	private String taste;
	
	Apple(String name, String taste){
		super(name, taste);
		this.taste = taste;
	}
	
	public void eat() {
		System.out.println("The taste of the apple is: " + taste);
	}
}
