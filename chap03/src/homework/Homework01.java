package homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("말해보세요 : ");
		String input = sc.nextLine();
		String result = input.equals("간다") ? "온다" : "간다" ;
		System.out.print("앵무새 : " + result);
		sc.close();
	}
}
