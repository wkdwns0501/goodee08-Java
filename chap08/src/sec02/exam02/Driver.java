package sec02.exam02;

public class Driver {
	
	// 매개 변수로 Vehicle 인터페이스를 구현한 다양한 구현 객체가 들어올 수 있음
	public void drive(Vehicle vehicle) {
		vehicle.run(); // 구현 객체의 재정의된 run()이 호출됨
	}
}
