package homework03;

public class Product {
	
	String name;
	int price;
	
	public Product() {}

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public int calculatePrice() {
		return price - price * 10 / 100;
	}
	
}
