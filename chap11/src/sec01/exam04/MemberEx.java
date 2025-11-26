package sec01.exam04;

import java.util.HashMap;

public class MemberEx {
	public static void main(String[] args) {
		HashMap<Member, String> hashMap = new HashMap<Member, String>();
		
		hashMap.put(new Member("fall"), "value1");
		hashMap.put(new Member("winter"), "value2");
		// 첫번째 멤버 객체와 동등 객체로 판단하고 키가 동일하므로 값을 덮어 씌움
		hashMap.put(new Member("fall"), "value3");
		
		System.out.println(hashMap.size());
	}
}
