package sec01.exam02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentListEx {
	public static void main(String[] args) {
		// 타입 파라미터로 사용자 정의 객체를 사용할 경우
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("김재현", 30));
		studentList.add(new Student("이수진", 25));
		studentList.add(new Student("박민수", 40));
		
		// 객체 검색
		// 사용자 정의 객체를 사용할 경우 indexOf(), contains()가
		// 해당 객체 존재 여부를 판단하는 기준은 equals()
		// equals() 메소드를 재정의 해야 동등 객체로 판단
		
		if (studentList.indexOf(new Student("김재현", 30)) != -1) {
			System.out.println("indexOf: 있다.");
		} else {
			System.out.println("indexOf: 없다.");
		}
		
		if (studentList.indexOf(new Student("김재현", 30)) != -1) {
			System.out.println("contains: 있다.");
		} else {
			System.out.println("contains: 없다.");
		}
		
		// 요소 정렬
		// Integer, String 같은 경우 Collections.sort()를 바로 사용 가능
		// Student처럼 사용자 정의 객체끼리 비교할 경우 비교 불가능
		// 정렬 기준으로 어떤 값을 사용할지 별도로 구현해야 함
		// 예: name을 기준으로 정렬할 것인가, age를 기준으로 정렬할 것인가
		
		// Comparator와 Comparable 2가지 방법
		// 객체 정렬에 필요한 메소드(정렬 기준 제공)를 정의한 인터페이스
		// Comparable(자기 자신과 비교)은 한 클래스에 하나의 기준만 정의 가능
		// => 객체의 기본 정렬 기준을 정의할 때 사용
		// Comparator(외부에서 비교)는 여러 기준을 자유롭게 생성 가능
		// => 객체와 분리된 확장 가능한 정렬 기준, 기본 정렬 기준 외에 다른 기준이 필요할 때 사용
		
		// 1. Student 클래스가 Comparable을 구현
		// 기본 정렬(age 오름차순)
		// sort()는 두 대상을 비교하여 자리 바꿈을 반복함
		Collections.sort(studentList); // 재정의한 compareTo() 기준으로 정렬
//		Collections.sort(studentList, Comparator.reverseOrder());
		System.out.println("기본 정렬(Comparable): ");
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println();
		
		// 2. Comparator 사용
		// 구현 객체 사용
		studentList.sort(new AgeComparatorImpl());
		
		// 익명 구현 객체 사용
		studentList.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return  o1.getAge() - o2.getAge();
			}
		});
		
		// 람다식으로 리팩터링
		studentList.sort((o1, o2) -> {
			return o1.getAge() - o2.getAge();
		});
		
		for (Student student : studentList) {
			System.out.println(student);
		}
		
	}
}
