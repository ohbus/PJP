package assignment2;

public class Flower {
	String FlowerID;
	String FlowerName;
	String Color;
	int Price;
	public Flower(String FlowerID,String FlowerName,String Color,int Price) {
		this.FlowerID=FlowerID;
		this.FlowerName=FlowerName;
		this.Color=Color;
		this.Price=Price;
	}
	public String getFlowerID() {
		return FlowerID;
	}
	public void setFlowerID(String flowerID) {
		FlowerID = flowerID;
	}
	public String getFlowerName() {
		return FlowerName;
	}
	public void setFlowerName(String flowerName) {
		FlowerName = flowerName;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}

}
