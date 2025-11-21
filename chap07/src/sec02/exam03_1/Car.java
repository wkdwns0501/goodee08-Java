package sec02.exam03_1;

public class Car {
	// 필드
	// 다형성을 활용하면, 어떤 타이어든 Tire를 상속 또는 구현하기만 하면 됨
	// Car 클래스는 변경 없이 다양한 타이어를 수용할 수 있음
	// => 유지보수성과 확장성이 좋아짐
	Tire frontLeftTire = new Tire("앞왼쪽", 6); // 일반 순정 타이어
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	// 참고:
	// 필드에 다형성을 쓰지 않으면 코드의 유연성과 확장성이 떨어짐
	// 예를 들어 HankookTire라는 구체적인 타입으로 필드를 선언하면, 나중에 KumhoTire로 바꾸고 싶을 때
	// Car 클래스 내부의 모든 코드 수정이 필요 또는 새로운 Car 클래스 선언 필요
	// 즉, 타이어가 바뀌면 차도 바꿔야 하는 구조가 됨
	
	//메소드
	// 4개의 타이어를 1회전 시키는 메소드
	// 어떤 타이어가 펑크 났는지 정수값으로 리턴
	public int run() {
		System.out.println("[자동차가 달립니다.]");
		if (frontLeftTire.roll() == false) { stop(); return 1; }
		if (frontRightTire.roll() == false) { stop(); return 2; }
		if (backLeftTire.roll() == false) { stop(); return 3; }
		if (backRightTire.roll() == false) { stop(); return 4; }
		return 0;
	}
	
	public void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
}
