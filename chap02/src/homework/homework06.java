package homework;

import java.util.Scanner;

public class homework06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한 자리 숫자를 입력하세요 : ");
		char num1 = sc.nextLine().charAt(0);
		int num2 = num1 - '0';
		int result = num2 * num2;
		System.out.println("입력한 숫자의 제곱은 " + result + "입니다.");
		sc.close();
	}
}
