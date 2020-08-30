package com.wipro.bean;

public class Car_Details {
	private String regno;
	private String model;
	private String color;
	private String manufacturer;
	public Car_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car_Details(String regno, String model, String color, String manufacturer) {
		super();
		this.regno = regno;
		this.model = model;
		this.color = color;
		this.manufacturer = manufacturer;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "Car_Details [regno : " + regno + ", model : " + model + ", color : " + color + ", manufacturer : " + manufacturer + "]";
	}
}
