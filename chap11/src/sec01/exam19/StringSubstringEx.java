package sec01.exam19;

public class StringSubstringEx {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
				
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(0, 6);
		System.out.println(secondNum);
		
		// 활용: 파일 확장자 확인
	}
}
