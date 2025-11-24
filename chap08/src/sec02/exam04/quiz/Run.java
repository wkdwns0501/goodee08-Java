package sec02.exam04.quiz;

public class Run {
	public static void main(String[] args) {
	// Quiz
//	실행 클래스와 내용에 맞도록 Animal, Dog, Lion, Eagle 클래스와 Flyable 인터페이스 구현하시오.
//	Dog, Lion, Eagle은 Animal을 상속 받고 Eagle은 날 수 있으므로 Flyable을 구현한다.

//	Animal 추상 클래스
//	1. 필드(private 접근 제한): 
//		1) kind(문자열): 동물의 종류
//		2) leg(정수): 다리수
//	2. 생성자: 동물의 종류, 다리수 입력 받기
//	3. getter
//	4. 메소드
//		1) void eat(); => 추상 메소드
//		2) void sound(); => 추상 메소드
	
//	Flyable 인터페이스
//	1. 추상 메소드
//		void fly();
	
//	[출력]
//	강아지, 다리수: 4개
//	멍멍 짖는다.
//	주인이 주는대로 먹는다.
//	사자, 다리수: 4개
//	어흥거린다.
//	초식 동물을 잡아 먹는다.
//	독수리, 다리수: 2개
//	모른다.
//	동물을 잡아 먹는다.
//	독수리는 날아 다닌다.
	
		Animal[] animalArr = new Animal[3];
		
		animalArr[0] = new Dog();
		animalArr[1] = new Lion();
		animalArr[2] = new Eagle();
		
		for (Animal animal : animalArr) {
			// Quiz
			System.out.println(animal.getKind() + ", 다리수: " + animal.getLeg());
			animal.sound();
			animal.eat();
			// 타입으로 Eagle을 쓰면 독수리만 가능 -> 독수리만 가지고 있는 것을 쓸 때 사용
			// 근데 fly()라는 날 수 있는 기능은 독수리 뿐만 아니라
			// Flyable을 구현한 날 수 있는 동물들은 다 가지고 있으므로 Flyable 타입을 사용
			if (animal instanceof Flyable flyable) {
				flyable.fly();
			}
		}
	}

}
