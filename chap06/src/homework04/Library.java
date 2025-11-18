package homework04;

public class Library {
	
	// 메세지 출력 메소드
	String printMessage (String message) {
		String result = message;
		return result;
	}
	
	// 1~100의 합 구하는 메소드
	int plus1To100 () {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	// 홀수/짝수 판별 메소드
	String checkOddEven (int num) {
		if (num%2 == 0) return "짝수";
		else return "홀수";
	}
	
	// 영문자 존재 판별 메소드
	boolean containEng (String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
	        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	            return true;
	        } 
		}
		return false;
	}
	
	// 문자열에 문자가 몇 개 포함되어 있는지 판별 메소드
	int containChar (String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) count++;
		}
		return count;
	}
	
	// 구구단 출력 메소드
	void gugudan (int num) {
		System.out.println("=== " + num + "단 ===");
		int result = 0;
		for (int i = 1; i <= 9; i++) {
			result = num * i;
			System.out.println(num + " X " + i + " = " + result);
		}
	}
}
