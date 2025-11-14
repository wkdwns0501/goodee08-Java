package sec01.exma01;

public class StringEqualsEx {
	public static void main(String[] args) {
		String str1 = "김재현";
		String str2 = "김재현";
		
		// 번지(주소값) 비교 => 동일한 객체인지 비교
		if (str1 == str2) {
			System.out.println("str1 과 str2는 참조가 같음"); //같음
		} else {
			System.out.println("str1 과 str2는 참조가 다름"); 
		}
		
		// (중요) 순수 문자열 비교
		if (str1.equals(str2)) {
			System.out.println("str1 과 str2는 문자열이 같음"); // 같음
		} else {
			System.out.println("str1 과 str2는 문자열이 다름");
		}
		
		String str3 = new String("김재현");
		String str4 = new String("김재현");
		
		// 번지(주소값) 비교 => 동일한 객체인지 비교
		if (str3 == str4) {
			System.out.println("str3 과 str4는 참조가 같음");
		} else {
			System.out.println("str3 과 str4는 참조가 다름"); // 다름
		}
		
		// (중요) 순수 문자열 비교
		if (str3.equals(str4)) {
			System.out.println("str3 과 str4는 문자열이 같음"); // 같음
		} else {
			System.out.println("str3 과 str4는 문자열이 다름");
		}
	}
}
