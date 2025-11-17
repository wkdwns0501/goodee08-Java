package homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		// 올라갔다 내려갔다 만들기
		Scanner sc = new Scanner(System.in);
		
		while (true) {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
			if (num % 2 == 0 || num < 3) {
				System.out.println("다시 입력하세요.");
				continue;
			} else {
				int[] numArray = new int[num];
				int count = 0;
				for (int i = 0; i < numArray.length; i++) {
					if (i < numArray.length/2+1) {
						numArray[i] = count++;
						System.out.print(count);
					} else {
						numArray[i] = count--;
						System.out.print(count);
					}
					if (i != numArray.length-1) {
						System.out.print(", ");
					}
				}
				break;
			}
			
		}
		sc.close();
	}
}
