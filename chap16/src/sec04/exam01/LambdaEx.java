package sec04.exam01;

public class LambdaEx {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.action((x, y) -> {
			double result = x + y;
			return result;
		});
		// return문이 하나만 있을 경우
		// 중괄호와 함께 return 키워드 생략 가능
		person.action((x, y) -> x + y); // 연산식
		person.action((x, y) -> sum(x, y)); // 메소드 호출
	}
	
	public static double sum(double x, double y) {
		return x + y;
	}
	
}
