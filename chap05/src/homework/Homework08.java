package homework;

public class Homework08 {
	public static void main(String[] args) {
		// 배열 복사 (System.arraycopy 사용)
		String[] menu = {"Burger", "Pizza", "Pasta"};
		String[] add = {"Salad","Soup"};
		String[] result = new String[menu.length + add.length];
		
		System.arraycopy(menu, 0, result, 0, menu.length);
		System.arraycopy(add, 0, result, 3, add.length);
		
		System.out.print("어제 메뉴판 : ");
		for (int i = 0; i < menu.length; i++) {
			System.out.print(menu[i]);
			if (i != menu.length-1) {
				System.out.print(", ");
			}
		}
		
		System.out.print("\n오늘 메뉴판 : ");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			if (i != result.length-1) {
				System.out.print(", ");
			}
		}
		
	}
}
