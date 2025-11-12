package homework;

import java.util.Scanner;

public class homework05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		sc.nextLine();
		System.out.print("영어 : ");
		double en = sc.nextDouble();
		sc.nextLine();
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		sc.nextLine();
		double total = kor + en + math;
		double avg = total / 3;
		System.out.printf("총점 : %d 평균 : %d", (int) total, (int) avg);
		sc.close();
	}
}
