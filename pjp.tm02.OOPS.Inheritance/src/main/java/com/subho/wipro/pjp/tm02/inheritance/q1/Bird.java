package com.subho.wipro.pjp.tm02.inheritance.q1;

public class Bird extends Animal {
	
	void eat() {
		System.out.println("Bird eats");
	}

	void sleep() {
		System.out.println("Bird sleeps");
	}
	
	void fly() {
		System.out.println("Bird fly");
	}
	
	public static void main(String[] args) {
		Animal o1 = new Animal();
		Bird o2 = new Bird();
		o1.eat();
		o1.sleep();
		o2.eat();
		o2.sleep();
		o2.fly();
	}
}
