package sec01.exam08;

public class SystemTimeEx {
	public static void main(String[] args) {
		// 1부터 100만까지 합을 구하는데 걸리는 시간 측정
		long start = System.nanoTime(); // 시작 시간
		
		int sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		
		long end = System.nanoTime(); // 끝 시간
		System.out.println("합 : " + sum);
		System.out.println("계산 시간 : " + (end - start) + "나노초가 소요되었습니다.");
		
		// 주로 실행 시간(성능) 측정할 때 사용
	}
}
