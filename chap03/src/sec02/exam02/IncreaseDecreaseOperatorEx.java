package sec02.exam02;

public class IncreaseDecreaseOperatorEx {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; // x = x + 1;
		++x; // x = x + 1;
		System.out.println("x=" + x);
		
		System.out.println("---------------");
		y--; // y = y - 1;
		--y; // y = y - 1;
		System.out.println("y=" + y);
		
		// 다른 연산자와 같이 쓸 때
		
		System.out.println("---------------");
		// 후위 연산자는 값을 먼저 사용한 뒤 증감시키는 연산자
		z = x++; // z = x; x = x + 1;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("---------------");
		// 전위 연산자는 값을 먼저 증감시킨 뒤 사용하는 연산자
		z = x++; // x = x + 1; z = x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");
		// Quiz1
		// z, x, y의 값은? 현재 x=14, y=8, z=14
		z = ++x + y++; // x=15, y=9, z=23
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
		
		System.out.println("-----------------------");
		// Quiz2
		// 다음 코드 실행 후 x의 값은?
		x = 3; // x=3

		if (x++ == 3) {
		    x++; // x=5
		}
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");
		// Quiz3 (개념 이해를 위한 퀴즈로 실무에서는 아래와 같이 쓰면 안됨)
		// 다음 코드 실행 후 a, b, result1, result2의 값은?
		int a = 10;
		int result1 = ++a + a++; // result1=11+11=22, a=12
		System.out.println("result1=" + result1 + ", a=" + a);
		int b = 10;
		int result2 = b++ + ++b; // result2=10+12=22, b=12
		System.out.println("result2=" + result2 + ", b=" + b);
		
		System.out.println("-----------------------");
		x = 1; // x=3
		y = x++ + ++x + x; // y=1+3+3=7
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}
