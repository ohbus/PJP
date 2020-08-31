package com.subho.wipro.pjp.tm02.cao;

public class Box {
	double width, height, depth;
	
	Box(double width, double height, double depth){
		this.width = width;
		this.height =  height;
		this.depth = depth;
	}
	
	public double volume() {
		double vol = width * height * depth;
		return vol;
	}
	
	public static void main(String[] args) {
		Box obj1 = new Box(2.3, 4.0, 5.5);
		double vol  =  obj1.volume();
		System.out.println(":The volume of the box is: " + vol);
	}
}
