package homework03;

public class Library {
	
	// 문자열 합치기 메소드
	String concatString(String str1, String str2) {
		String result = str1 + str2;
		return result;
	}
	
	// 정수 곱하기 메소드
	int integerMultiplication (int num1, int num2) {
		if (num1 < num2) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		} else {
			int result = num1 * num2;
			return result;
		}
	}
	
	// 동일 문자열 판별 메소드
	boolean checkSameString (String str1, String str2) {
		if (str1.equals(str2)) return true;
		else return false;
	}
	
}
