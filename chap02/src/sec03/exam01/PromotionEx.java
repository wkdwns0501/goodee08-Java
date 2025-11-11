package sec03.exam01;

public class PromotionEx {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // 1byte -> 4byte, 자동 형변환
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue; // 2byte -> 4byte, 자동 형변환
		System.out.println("intValue: " + intValue); // 유니코드 값 출력
		
		intValue = 30;
		long longValue = intValue; // 4byte -> 8byte, 자동 형변환
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue; // 실제 저장할 수 있는 값의 범위는 long < float, 자동 형변환
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue; // 4byte -> 8byte, 자동 형변환
		System.out.println("doubleValue: " + doubleValue);
		
		// 주의! byte -> char 는 자동 형변환 불가 
		byte byteVal = 65;
//		char charVal = byteVal; // char는 음수를 포함하지 않지만, byte는 음수를 포함
		
	}
}
