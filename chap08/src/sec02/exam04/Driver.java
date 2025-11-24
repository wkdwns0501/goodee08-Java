package sec02.exam04;

public class Driver {
	
	// 매개 변수로 Vehicle 인터페이스를 구현한 다양한 구현 객체가 들어올 수 있음
	public void drive(Vehicle vehicle) {
		// 버스일 때는 승차요금 확인이 필요
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		
		// instanceof의 자동 타입 변환
		if (vehicle instanceof Bus bus) {
			bus.checkFare();
		}
		
		vehicle.run(); // 구현 객체의 재정의된 run()이 호출됨
	}
}
