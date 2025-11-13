package homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("친구의 수 : ");
		int input1 = sc.nextInt();
		sc.nextLine();
		System.out.print("사탕의 수 : ");
		int input2 = sc.nextInt();
		int candy = input2 / input1;
		int remainCandy = input2 % input1;
		System.out.println("1인당 사탕 개수 : " +  candy + "개");
		System.out.println("남은 사탕 개수 : " +  remainCandy + "개");
		sc.close();
	}
}
