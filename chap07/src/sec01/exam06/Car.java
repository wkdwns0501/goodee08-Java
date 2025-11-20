package sec01.exam06;

public class Car {
	
	public int speed;
	
	public void speedUp() {
		speed +=1;
	}
	
	// final 메소드
	// 공통으로 제공되는 기능인데 자식쪽에서 실수로 재정의 못하도록 막고 싶을 때
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
