package sec03.exam07;

public class PrimitiveAndStringConvertEx {
	public static void main(String[] args) {
		// 문자열 -> 기본 타입
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("valu3: " + value3);
		
//		System.out.println(Integer.parseInt("1a")); // 숫자로 변환 불가한 경우 예외 발생
//		System.out.println(Byte.parseByte("128")); // byte 값의 범위를 벗어남
		
		// 기본 타입 -> 문자열
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
		// (참고) 문자열로 변환하는 다른 방법
		String str = "" + 3;
		System.out.println(str);
	}
}
