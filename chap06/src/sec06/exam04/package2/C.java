package sec06.exam04.package2;

import sec06.exam04.package1.A;

public class C {
	// 필드
	A a1 = new A(true);
	
	// default라 다른 패키지에서 사용 불가
//	A a2 = new A(1);
	
	// private라 다른 클래스에서 사용 불가
//	A a3 = new A("문자열");
}
