package homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		// 값 입력 받아 배열 만들기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int inputLength = sc.nextInt();
		int[] inputArray = new int[inputLength];
		
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int input = sc.nextInt();
			inputArray[i] = input;
		}
		
		int total = 0;
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
			total += inputArray[i];
		}
		
		System.out.println("\n총 합 : " + total);
		sc.close();
	}
}
