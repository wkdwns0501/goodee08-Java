package sec03.exam04.quiz;

public class Animal {
	// 필드
	String kind;
	int age;
	
	// 종류만 받는 생성자(기본 종류: 사람)
	public Animal(String kind) {
//		this.kind = kind;
//		this.age = 1;
		
		this(kind, 1);
	}
	// 나이만 받는 생성자(기본 나이: 1살)
	public Animal(int age) {
//		this.kind = "사람";
//		this.age = age;
		
		this("사람", age);
	}
	// 종류와 나이를 모두 받는 생성자
	public Animal(String kind, int age) {
		this.kind = kind;
		this.age = age;
	}
	
	// 메소드
	public void info() {
		System.out.println(kind + ": " + age + "살");
	}
}
