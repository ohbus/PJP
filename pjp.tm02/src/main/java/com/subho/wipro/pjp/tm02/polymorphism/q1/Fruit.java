package com.subho.wipro.pjp.tm02.polymorphism.q1;

public class Fruit {
	private String name;
	private String taste;
	private int size;
	
	Fruit(String name, String taste){
		this.name = name;
		this.taste = taste;
	}
	
	public void eat() {
		System.out.println("The name of the fruit is: " + name);
		System.out.println("The taste of the fruit is: " + taste);
	}
}
