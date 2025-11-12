package homework;

import java.util.Scanner;

public class homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String input = sc.nextLine();
		char first = input.charAt(0);
		char second = input.charAt(1);
		char third = input.charAt(2);
		System.out.println("첫번째 문자 : " + first + " 두번째 문자 : " + second + " 세번째 문자 : " + third);
		sc.close();
	}
}
