package sec05.exam05;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa";
//		p1.ssn = "124124-2141245";
		p1.name = "홍사원";
		System.out.println(p1.name);
	}
}
