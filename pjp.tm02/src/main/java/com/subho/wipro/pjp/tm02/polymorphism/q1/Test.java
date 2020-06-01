package com.subho.wipro.pjp.tm02.polymorphism.q1;

public class Test {
	
	public static void main(String[] args) {
		Fruit obj = new Fruit("Orange", "Sweet");
		obj = new Apple("Apple", "sweet");
		obj.eat();
		obj = new Orange("Orange", "Sweet");
		obj.eat();
	}
}