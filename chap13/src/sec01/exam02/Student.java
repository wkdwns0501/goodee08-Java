package sec01.exam02;

import java.util.Objects;

// Comparable<T>
// 자바에서 객체 간의 "기본 정렬 순서"를 정의하기 위해 사용되는 인터페이스
// 객체를 정렬할 수 있도록 비교 기준을 정의
public class Student implements Comparable<Student>{
	
	private String name;
	private int age;
	
	public Student() {}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student other) {
		// 중요! 리턴값의 의미(오름차순을 기준으로 함)
		// 음수 : this < other - this가 앞에 옴
		// 양수 : this > other - this가 뒤에 옴
		// 0: this == other - 순서 유지
		// 즉, 양수이면 자리를 바꿔주고 음수 또는 0이면 자리를 바꾸지 않음
		
		// 나이 오름차순
		// 25 - 30 = -5 (음수) -> 25세가 앞으로
//		return this.age - other.age;
		
		// 나이 내림차순
		// 30 - 25 = 5 (양수) -> 그대로
//		return other.age - this.age; // 또는 -1을 곱하기
		
		// (권장) 나이 오름차순을 비교 연산으로 구현시
		// 기본 정렬은 나이순, 나이가 같으면 이름순
//		if (this.age < other.age) return -1;
//		else if(this.age > other.age) return 1;
//		else {
//			// 이름순
//			return 0;
//		}
		
		// 문자열은 연산자로 비교 불가능
		// String 클래스에 재정의된 compareTo() 사용
		
//		return this.name.compareTo(other.name); // 오름차순
		return other.name.compareTo(other.name); // 내림차순
	}
	
}
