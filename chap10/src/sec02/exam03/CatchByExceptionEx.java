package sec02.exam03;

public class CatchByExceptionEx {
	public static void main(String[] args) {
		// 2가지 예외가 발생 가능
		// 하나의 try catch문으로 합치기(다중 catch문 사용)
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0]; // 실행 예외 발생
			data2 = args[1];
			
			// "a20" 같이 문자가 섞이면 실행 예외 발생
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (NumberFormatException | NullPointerException e) {
			// (참고) 자바 7 이상부터 멀티캐치 구문 가능
			// 여러 예외를 | 로 연결해서 하나의 catch 블록에서 처리 가능
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
		
	}
}
