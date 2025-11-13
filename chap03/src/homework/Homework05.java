package homework;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호(-) : ");
		String input = sc.nextLine();
		char genderCode = input.charAt(7);
		String result = (genderCode < '1' || genderCode > '4') 
								? "입력하신 주민번호는 잘못된 값입니다."
								: (genderCode == '1' || genderCode == '3') 
									? "남성" : "여성";
		System.out.println(result);
		
		sc.close();
	}
}
