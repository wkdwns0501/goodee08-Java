package sec02.exam05;

public class CharOperationEx {
	public static void main(String[] args) {
		// 참고
		// 리터럴끼리의 연산은 컴파일 타임에 계산하고 
		// 실제 바이트 코드에 결과값만 넣음(실행 성능을 최적화하기 위해)
		char c1 = 'A' + 1; // 리터럴을 더해서 char 에 넣는 것은 가능
		// 컴파일러가 컴파일 단계에서 연산
		
		char c2 = 'A';
//		char c3 = c2 + 1; // 변수 + 리터럴 c2변수가 int 로 형변환 됨(JVM에서 실행 시 연산)
		int i1 = c2 + 1;
	}
}
