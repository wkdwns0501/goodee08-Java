package sec01.exam04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// LinkedList(연결 리스트)는 배열의 단점을 보완
// 불연속적으로 존재하는 데이터를 연결(link)
public class LinkedListEx {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// 0 인덱스에 10000개의 데이터를 삽입하여 시간 측정
		startTime = System.nanoTime();
		for (int i = 0; i <= 10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + " ns");
		
		startTime = System.nanoTime();
		for (int i = 0; i <= 10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + " ns");
		
		// 참고
		// LinkedList는 요소의 추가/삭제에는 유리
		// 반대로 요소의 접근성은 나쁨
		System.out.println(list1.get(9999)); // 배열은 직접 메모리 주소를 찾아감
		System.out.println(list2.get(9999)); // 순차적으로 노드를 따라 이동
	}
}
