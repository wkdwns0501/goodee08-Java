package sec02.exam04;

public class Driver {
	// 부모 타입의 매개 변수(참조 타입)이면 
	// Vehicle 자신의 객체 뿐만 아니라 자식 객체도 들어올 수 있다.
	// 즉, 운전자는 버스, 택시 모두 운전 가능
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
	
	// 매개 변수의 다형성을 안쓰면?
	// 아래 코드와 같이 drive() 메소드를 여러 개 만들어야 됨
	// 차량이 늘어날수록 메소드 오버로딩이 계속 늘어남
	// 비슷한 기능이 반복됨 => 코드 중복
	// 유지보수 어려움, 유연성 떨어짐
	public void drive(Bus bus) {
		bus.run();
	}
	public void drive(Taxi taxi) {
		taxi.run();
	}
}
