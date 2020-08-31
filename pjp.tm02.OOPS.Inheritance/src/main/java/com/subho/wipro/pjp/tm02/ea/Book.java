package com.subho.wipro.pjp.tm02.ea;

public class Book {
	private String name;
	private double price;
	private int qtyInStock;
	Author author;
	
	Book(String name, double price, int qtyInStock){
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getqtyInStock() {
		return qtyInStock;
	}
	
	public void settName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setqtyInStock(int qtyInStock) {
		 this.qtyInStock = qtyInStock;
	}
	
	public static void main(String[] args) {
		Book o1 = new Book("ABC", 250.54, 10000);
		System.out.println("Book name = " + o1.getName());
		System.out.println("Price = " + o1.getPrice());
		System.out.println("Quantity = " + o1.getqtyInStock());
	}
}
