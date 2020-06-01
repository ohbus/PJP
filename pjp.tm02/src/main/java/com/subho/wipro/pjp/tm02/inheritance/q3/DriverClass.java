package com.subho.wipro.pjp.tm02.inheritance.q3;

public class DriverClass {
	public static void main(String[] args) {
		
		CollegeStudent obj1 = new CollegeStudent("Black Light", "23-07-1997", 4, "Computer Science");
		obj1.show();
		Teacher obj2 = new Teacher("Coward Courage", "28-03-1998", 20000, "Electrical Engineering");
		obj2.show();
	}
}
