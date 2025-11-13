package sec02.exam11;

import java.util.Scanner;

public class ConditionalOperatorEx {
	public static void main(String[] args) {
		int score = 85;
		
		// 값이 오는 자리에 연산식이 올 수 있음
		char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : 'C' ;
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		// Quiz
//		0~100사이의 점수를 입력받아 삼항(조건) 연산자를 사용하여 
//		점수가 60점 이상이면 "합격",
//		60점 미만인 경우 "불합격"을 출력하는 프로그램을 구현하시오.
//		단, 음수이거나 100이 넘는 점수는 "점수입력오류"로 출력한다.
//
//		[입력] [출력]
//		 85 => 합격
//		 50 => 불합격
//		-10 => 점수입력오류
		
		// 이런 문제는 오류 케이스를 먼저 걸러내라
		Scanner sc = new Scanner(System.in);
		int sco = sc.nextInt();
		String result = (sco > 100 || sco < 0) ? "점수입력오류" : (sco >= 60) ? "합격" : "불합격" ;
		sc.close();
		System.out.println(result);
	}
}
