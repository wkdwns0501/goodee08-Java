package sec01.exam05;

import java.util.Date;

public class ToStringEx {
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.toString());
		System.out.println(obj1); // toString() 자동 호출
		
		Date obj2 = new Date();
		// Date 클래스에서 날짜/시간 정보가 나오도록 재정의 한 것
		System.out.println(obj2.toString()); 
		System.out.println(obj2);
	}
}
