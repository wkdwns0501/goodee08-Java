package homework04;

public class Main {
	public static void main(String[] args) {
		
		Menu[] menu = new Menu[5];
		
		for (int i = 0; i < menu.length; i++) {
			int randomNum = (int) (Math.random() * 4) + 1;
			
			if (randomNum % 2 == 0) {
				menu[i] = new Dish("스테이크", 30000, "소고기, 소금, 후추");
			} else {
				menu[i] = new Drink("아메리카노", 5000, "에스프레소 1샷, 물");
			}
			
			if (menu[i] instanceof Dish dish) {
				dish.cook();
			} else if (menu[i] instanceof Drink drink) {
				drink.cook();
			}
		}
		
	}
}
