package com.subho.wipro.pjp.tm07.proj.sb;

public class Box {
	double length;
	double width;
	double height;
	double volume;
	
	public Box(double length, double width, double height) {
		this.length = length;
		this.height = height;
		this.width = width;
		calcVolume();
	}
	
	public double calcVolume() {
		this.volume =  length * width * height;
		return volume;
	}
	
	public String toString() {
		return   "Length = " + length + " Width =  " + width + " Height = " + height + " Volume = " + volume;
	}

}