package sec01.exam00;

public class LambdaEx {
	
	// 람다식 작성 연습
	// 람다식 작성 후 주석 처리
	
	// 메소드1
	int max(int a, int b) {
		return a > b ? a : b;
	}
	// 람다식1
//	(int a,int b) -> {
//		return a > b ? a : b;
//	}
	// 타입 생략
//	(a, b) -> {
//		return a > b ? a : b;
//	}
	// 한 줄 실행할 때 {return ...} 생략
//	(a, b) -> a > b ? a : b
	
	// 메소드2
	void printVar(String name, int i) {
		System.out.println(name + "=" + i);
	}
	// 람다식2
//	(name, i) -> System.out.println(name + "=" + i)
	
	// 메소드3
	int square(int x) {
		return x * x;
	}
	// 람다식3 (매개변수가 1개라면 () 생략 가능)
//	x -> x * x
	
	// 메소드4
	int roll() {
		return (int) (Math.random() * 6);
	}
	// 람다식4
//	() -> (int) (Math.random() * 6)
	
}
