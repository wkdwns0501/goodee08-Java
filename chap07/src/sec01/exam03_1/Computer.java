package sec01.exam03_1;

public class Computer extends Calculator {
	// 자바에서 제공하는 정확한 PI 값을 사용해 정밀한 계산을 하도록 변경
	@Override // 오버라이딩이 제대로 되었는지 컴파일 단계에서 검사
	double areaCircle(double r) {
		System.out.println("Computer의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
	
	
}
