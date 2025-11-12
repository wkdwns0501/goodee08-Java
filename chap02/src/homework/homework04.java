package homework;

import java.util.Scanner;

public class homework04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자을 입력하세요 : ");
		char uniCode = sc.next().charAt(0);
		int uni = uniCode;
		System.out.println(uniCode + "의 유니코드 : " + uni);
		sc.close();
	}
}
