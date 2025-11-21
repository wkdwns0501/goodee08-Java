package sec02.exam06;

public class InstanceofEx {
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
//		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
//		method2(parentB); // ClassCastException 예외 발생
	}
	
	public static void method1(Parent parent) {
		// 강제 타입 변환을 하기 전에 검사(안전한 코딩)
		// instanceof를 사용하여 안전하게 Child 타입으로 변환하기
		// 검사할 객체(좌측) instanceof 클래스 타입(우측)
		// parent 변수가 참조하는 객체가 Child 타입의 인스턴스인지 검사 (T/F)
		// (=Child 타입으로부터 만들어졌는지)
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - child로 변환 성공");
		} else {
			System.out.println("method1 - child로 변환 실패");
		}
		
		// 자바 12부터 추가된 문법
		// instanceof 결과가 true일 경우 자동 타입 변환되어 변수에 대입
		if (parent instanceof Child child) {
			System.out.println("method1 - child로 변환 성공");
		} else {
			System.out.println("method1 - child로 변환 실패");
		}
		
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - child로 변환 성공");
	}
	
	// (정리)
	// 다형성: 여러 가지 형태를 가질 수 있는 성질을 말하는데
	// 자바에서는 부모 타입 참조 변수로 자식 타입 객체를 다루는 것을 말함
	// 이로 인해 하나의 이름으로 여러 동작을 할 수 있게 하는 것(실행 결과가 다양하게 나올 수 있다.)
	   
	// 다형성의 장점
	// 1. 매개변수의 다형성
	// 예: 장바구니에 물건을 담는 기능, 물건을 구매하는 기능 등
	// void addCart(Product prod) {}
	// 2. 하나의 배열 또는 컬렉션으로 여러 종류의 객체 다루기 가능
	// 예: 스타크래프트 유닛 부대 지정(마린, 탱크, 레이스 등)
	// Unit[] units = new Unit[12];
	// Unit에 정의되는 공통 기능: move(), attack()
	// 각 유닛만의 고유 기능: 마린 - 스팀팩, 탱크 - 시즈 모드, 레이스 - 클로킹
	// 3. 필드의 다형성
	// 예: 특정 이벤트(세일) 기간에만 적용할 객체, 다양한 결제 수단으로 결제를 수행할 때, 다양한 DB 다룰 때 등
	   
	// 결론
	// => 다형성을 잘 활용하면 유연하고 확장성있고, 유지보수가 편리한 프로그램을 만들수 있음

	
}
