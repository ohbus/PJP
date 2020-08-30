package assignment4;

public class Product {
	String ProductName;
	int ProductId;
	int Price;
	public Product(String ProductName,int ProductId,int Price) {
		this.ProductName=ProductName;
		this.ProductId=ProductId;
		this.Price=Price;
		}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}

}
