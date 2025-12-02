package sec01.exam05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		// HashSet은 가장 기본적인 Set의 구현체
		// 대용량 데이터의 저장/탐색에 유리하며, List 계열보다는 사용 빈도가 낮은 편
		// 중복된 데이터 제거가 필요할 때 유용 (예: ArrayList의 요소에서 중복을 제거할 때)
		
		// Set 특징
		// 수학의 집합과 유사
		// (해시코드 값을 기반으로 저장하기엔) 순서 없이 데이터 저장 (저장된 요소를 순서대로 꺼낼수 없음)
		// 동일한 요소를 중복해서 저장할 수 없음 (저장 자체를 안함)
		// 하나의 null 만 저장 가능
		
		// 중복 판단 기준: hashCode()로 위치 찾고, equals()로 동등성 확인
		
		// (참고만) HashSet의 내부 원리
		// 1단계: set.add(new Student("김재현", 30)); 첫 번째 객체
		// hashCode() 호출 -> 예: 123456
		// 이 해시값을 바탕으로 버킷 위치 결정
		// 해당 버킷이 비어 있음 -> 객체 저장 완료
		// [버킷 테이블]
		// 123456 -> Student("김재현", 30)
		
		// 2단계: set.add(new Student("김재현", 30)); 두 번째 객체 (내용 같지만 객체 다름)
		// hashCode() 호출 -> 여전히 123456 (name과 age가 같기 때문)
		// 버킷 123456에 이미 객체가 있음
		// 그 객체와 equals() 비교 -> true -> 중복으로 판단 -> 저장 안 함
		
//		Set<String> set = new HashSet<String>();
		Set<String> set = new HashSet<>(); // 생략하면 왼쪽 Set에 지정된 타입을 따라 감 (타입 추론)
		
		// 객체 추가
		// 추가할 때마다 중복 확인 (hashCode()와 equals() 호출) 후 추가함
		// 기존에 같은 객체가 없을 때만 저장하고 true 반환
		set.add("Java");
		set.add("JDBC");
		set.add("Setvlet/JSP");
		set.add("Java"); // 중복 저장 안됨
		set.add("iBATIS");
		
		// Set 출력하기
		System.out.println(set);
		
		// 저장된 총 객체 수 얻기
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		// Iterable과 Iterator - 컬렉션 조회 방법의 표준화(=인터페이스)
		// 여러 종류의 컬렉션 (Iterable)을 같은 방법(Iterator)으로 읽을 수 있음
		
		// Iterator(반복자)로 모든 요소를 하나씩 가져오기
		// 컬렉션 요소를 하나씩 순회할 수 있도록 도와주는 인터페이스
		// 타입 파라미터는 저장된 객체와 동일하게 작성
		Iterator<String> iterator = set.iterator(); // iterator 구현 객체를 반환
		// 타입 지정 안하면 Object
		while (iterator.hasNext()) { // 다음 요소가 있는지 확인
			// 저장된 객체 수 만큼 반복
			String element = iterator.next(); // 1개의 요소를 읽어옴
			System.out.println("\t" + element);
			
			// remove(): next()로 반환한 요소를 제거
			if ("Java".equals(element)) {
				iterator.remove(); // iterator의 remove()
				// (참고) remove()는 next() 호출 이후에 한번만 호출 가능
			}
		}
		System.out.println(set + "\n");
		
		// 객체 삭제
		// index를 가지고 있는 List와 다르게 index가 없음
		// 객체의 hashCode()와 equals()를 기준으로 판단
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("총 객체수: " + set.size());
		
		// 향상된 for문으로 모든 객체를 하나씩 가져오기
		// 순서 즉, index가 없으므로 일반 for문 사용 불가
		// 당연히 get()과 같은 메소드도 사용 불가
		for (String element : set) {
			System.out.println("\t" + element);
		}
		System.out.println();
		
		// 객체 검색
		if (!set.isEmpty()) { // 컬렉션이 비어 있는지 조사
			// 주어진 객체가 저장되어 있는지 조사
			System.out.println("Java 있음? " + set.contains("Java"));
			System.out.println("Setvlet/JSP 있음? " + set.contains("Setvlet/JSP"));
		}
		System.out.println();
		
		// 모든 객체를 제거하고 비움
		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
		System.out.println();
		
		// HashSet과 집합
		// 수학의 집합을 효율적으로 처리하기에 적합한 구조
		// 두 집합의 합집합, 교집합, 차집합, 부분집합 연산 가능
		Set<Integer> class1 = new HashSet<Integer>();
		class1.add(1);
		class1.add(2);
		class1.add(3);
		Set<Integer> class2 = new HashSet<Integer>();
		class2.add(2);
		class2.add(3);
		class2.add(4);
		
		// 집합과 관련된 메소드
		// Collection에 변화가 있으면 true, 아니면 false를 반환
		
		// 합집합 - addAll
		// 두 개의 HashSet을 하나로 합쳐줌
		// 이때 두 개 의 HashSet에 공통적으로 포함된 데이터는 제거
//		System.out.println(class1.addAll(class2));
//		System.out.println("합집합: " + class1);
		
		// 교집합 - retainAll
		// 두 개의 HashSet에서 공통된 요소만 추려줌
//		System.out.println(class1.retainAll(class2));
//		System.out.println("교집합: " + class1);
		
		// 차집합 - removeAll
		// 기준 HashSet에서 대상 HashSet과의 교집합 제외
//		System.out.println(class1.removeAll(class2));
//		System.out.println("차집합: " + class1);
		
		// (주의) 위 3개의 메소드 모두 기준이 되는 HashSet의 데이터 자체를 바꿔버림
		// 새로운 HashSet을 반환하는 것이 아님
		
		// 부분집합
		// 기준 HashSet에 대상 HashSet의 요소들이 포함되어 있는지 확인
		System.out.println(class1.containsAll(class2));
		System.out.println("부분집합: " + class1);
		System.out.println();
		
		// 요소 정렬
		// HashSet 자체는 정렬 기능이 없는 컬렉션이기 때문에,
		// 정렬을 하려면 다른 컬렉션으로 변환한 뒤 정렬
		// List로 변환웋 Collections.sort 또는 List.sort() 사용
		Set<String> fruits = new HashSet<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Orange");
		System.out.println(fruits);
//		Collections.sort(fruits); // 불가(List 계열만 가능)
//		fruits.sort(); // 불가
		
		// Set -> List로 변환
		List<String> fruitsList = new ArrayList<String>(fruits);
		
		// 정렬
		Collections.sort(fruitsList); // 오름차순 정렬
		System.out.println(fruitsList);
//		fruitsList.sort(); // Comparator로 정렬 기준을 제공하면 정렬 가능
		
		// 필요하면 정렬된 순서를 유지하는 LinkedSet으로 다시 변환
		Set<String> sortedSet = new LinkedHashSet<String>(fruitsList);
		System.out.println(sortedSet);
		
		// Set 활용 팁: ArrayList의 요소에서 중복 제거하기
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Spring");
		list.add("Java");
		list.add("JDBC");
		System.out.println(list);
		
		// HashSet을 이용해 중복 제거
		Set<String> javaClass = new HashSet<String>(list); // 생성시 중복 제거 
		System.out.println(javaClass);
		
		// 필요시 다시 List로 변환
		List<String> dedupList = new ArrayList<String>(javaClass);
		System.out.println(dedupList);
		
	}
}
