package homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("방의 가로 입력: ");
		double x = sc.nextDouble();
		System.out.print("방의 세로 입력: ");
		double y = sc.nextDouble();
		double xy = x * y;
		double z = (x+y)*2;
		System.out.printf("가로 : %.1f 세로 : %.1f 면적 : %.2f 둘레 : %.1f", x, y , xy, z);
		sc.close();
	}
}
