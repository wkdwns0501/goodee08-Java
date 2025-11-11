package sec02.exam01;

public class IntegerLiteralEx {
	public static void main(String[] args) {
		// int(4byte)
		
		int var1 = 0b1011; // 2진수(하드웨어 제어 프로그래밍시 주로 사용)
		int var2 = 013; // 8진수
		int var3 = 11; // 10진수
		int var4 = 0xB3; // 16진수(RGB 색상값 저장시)
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
	}
}
