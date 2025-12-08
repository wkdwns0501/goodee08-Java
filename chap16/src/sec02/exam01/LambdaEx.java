package sec02.exam01;

public class LambdaEx {
	public static void main(String[] args) {
		Person person = new Person();
		
		// 실행문이 2개 이상인 경우 중괄호 필요
		person.action(() -> {
			System.out.println("출근");
			System.out.println("프로그래밍");
		});
		
		//실행문이 1개인 경우 중괄호 생략 가능
		person.action(() -> System.out.println("퇴근"));
		
	}
}
