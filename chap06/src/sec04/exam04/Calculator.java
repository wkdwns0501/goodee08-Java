package sec04.exam04;

public class Calculator {
	// 메소드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		// 클래스 내부에서 메소드 호출 시 메소드 이름으로 호출
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		System.out.println("실행 결과 : " + result);
	}
}
