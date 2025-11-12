package sec04.exam05;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while (true) {
			inputData = scanner.nextLine(); // 스캐너에서 읽은 한 줄 전체(엔터키 이전까지)
			if (inputData.equals("q")) break; // 객체 == 객체는 메모리상 다른 객체이기 때문에 항상 false
			System.out.println("입력된 문자열: " + inputData);
		}
		scanner.close();
		System.out.println("종료\n");
	}
}
