package homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게(kg) 입력: ");
		double weight = sc.nextDouble();
		sc.nextLine();
		System.out.print("키(cm) 입력: ");
		int heightCm = sc.nextInt();
		double heightM = heightCm / 100.00 ;
		double BMI = weight / (heightM * heightM);
		System.out.printf("몸무게(kg) : %.1f 키(m) : %.2f BMI 지수 : %.1f", weight, heightM, BMI);
		sc.close();
	}
}
