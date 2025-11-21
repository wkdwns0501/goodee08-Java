package sec03.exam03;

// 부모 클래스: 공통 결제 서비스 -> 추상화 -> 추상 클래스: 결제 서비스의 미완성된 공통 설계도
public abstract class PaymentService {
	// 결제 메소드
	public abstract void pay(int amount);
	
	// (참고) 인터페이스로 바꿔도 될까?
	// 결제 수단에 따라 공통 필드나 일부 구현 로직 없다면, 인터페이스로 만들어도 됨
	// 그러나 공통 필드나 공통메소드 구현이 필요하다면 추상 클래스가 더 적합
}
