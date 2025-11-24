package sec01.exam06;

public class MyClassEx {
	public static void main(String[] args) {
		// Quiz: 어떤 구현 객체가 실행될지 맞춰보기
		System.out.println("1)----------------");

		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn(); // TV를 켭니다.
		myClass1.rc.setVolume(5); // 현재 TV 볼륨: 5
		
		System.out.println("2)----------------");
		
		MyClass myClass2 = new MyClass(new Audio()); 
		// Audio를 켭니다. 현재 Audio 볼륨 : 5
		
		System.out.println("3)----------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		// Audio를 켭니다. 현재 Audio 볼륨 : 5
		
		System.out.println("4)----------------");
		
		MyClass myClass4 = new MyClass(); 
		myClass4.methodB(new Television());
		// TV를 켭니다. 현재 TV 볼륨: 5
	}
}
