package homework04;

public abstract class Menu {
	
	String name;
	int price;
	
	public Menu() {}

	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "메뉴명은 " + name + "이고, 가격은 " + price + "원 입니다.";
	}
	
	public abstract void cook();
	
}
