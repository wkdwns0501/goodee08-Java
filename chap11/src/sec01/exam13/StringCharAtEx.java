package sec01.exam13;

public class StringCharAtEx {
	public static void main(String[] args) {
		// 주민등록번호에서 남자와 여자를 구분하기
		String ssn = "010624-1230123";
		
		// 문자열에서 특정 인덱스의 문자 추출
		char gender = ssn.charAt(7);
		
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2', '4' :
			System.out.println("여자");
			break;
		}
		
		switch (gender) {
			case '1', '3' -> System.out.println("남자");
			case '2', '4' -> System.out.println("여자");
		}
		
	}
}
