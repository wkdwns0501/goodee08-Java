package sec01.exam08;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		// TreeSet
		// 데이터를 오름차순으로 자동 정렬
		// 저장한 순서 그대로 보장하지 않음
		// "정렬된 순서"를 보장
		
//		Set<String> set = new HashSet<String>();
//		Set<String> set = new LinkedHashSet<String>();
//		Set<String> set = new TreeSet<String>(); // Comparable로 구현한 기본 정렬 기준 사용
		
		// 기본 정렬 기준 외 - TreeSet 생성자에 Comparator를 매개값으로 전달
		Set<String> set = new TreeSet<String>(Collections.reverseOrder());
		
		set.add("동");
		set.add("서");
		set.add("남");
		set.add("북");
		System.out.println(set);
		
		// 사용자 정의 객체로 정렬 테스트
		// 정렬 기준이 없으면 예외 발생
		// 1. Comparable로 기본 정렬 기준 구현 또는 
		// 2. TreeSet 생성 시 매개값으로 Comparator 구현으로 정렬 기준 제공
		Set<Member> memberSet = new TreeSet<Member>();
		memberSet.add(new Member("김재현", 30));
		memberSet.add(new Member("이수민", 25));
		memberSet.add(new Member("박민수", 40));
		System.out.println(memberSet);
		
	}
}
