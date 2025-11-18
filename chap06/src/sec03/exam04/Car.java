package sec03.exam04;

public class Car {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	public Car() {
//		this.model = "자가용";
//		this.color = "은색";
//		this.maxSpeed = 250;
		
		this("자가용", "은색", 250);
	}
	
	Car(String model) {
//		this.model = model;
//		this.color = "은색";
//		this.maxSpeed = 250;
		
		this(model, "은색", 250);
	}
	
	Car(String model, String color){
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 250;
		
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed){
		// 공통 실행 코드
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// (정리) 중복된 필드 초기화 코드가 하나의 생성자에 집중되어, 유지보수와 가독성에 좋음
}
