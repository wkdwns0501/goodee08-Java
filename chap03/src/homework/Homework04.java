package homework;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		sc.nextLine();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		sc.nextLine();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		int total = kor + math + eng;
		double avg = total / 3;
		boolean isAllPass = (kor >= 60 && math >= 60 && eng >= 60);
		boolean isHighAvg = (avg > 90);
		String result = (isAllPass && isHighAvg) 
								? "휴대폰을 바꿀 수 있습니다." 
								: "휴대폰을 바꿀 수 없습니다.";
		
		System.out.println("합계 : " +  total + "점");
		System.out.println("평균 : " +  avg + "점");
		System.out.println(result);
		
		sc.close();
	}
}
