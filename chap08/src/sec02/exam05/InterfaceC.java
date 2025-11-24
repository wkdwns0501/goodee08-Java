package sec02.exam05;

// methodA() 와 methodB()도 필요하다면 상속을 통해 물려받음
// 인터페이스 끼리만 상속 가능
// 다중 상속이 가능(구현부가 없는 추상 메소드는 충돌 문제가 없기 때문에)
public interface InterfaceC extends InterfaceA, InterfaceB{
	void methodC();
}
