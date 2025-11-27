package sec01.exam09;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassEx {
	public static void main(String[] args) throws ClassNotFoundException {
		// Class 객체
		// 자바에서 해당 클래스의 메타 데이터를 표현하는 객체
		// 메타 데이터 : 데이터에 대한 데이터, 즉 어떤 데이터를 설명하는 정보
		// JVM 내에서 한 클래스당 하나의 Class 객체만 존재
		
		// Car 클래스의 Class 객체 얻기
		// 방법 1
		Class clazz = Car.class;
		
		// 방법 2
		Class claz = Class.forName("sec01.exam09.Car");
		
		// 방법 3
		Car car = new Car();
		Class clas = car.getClass();
		
		// (참고) 1, 2, 3 모두 같은 Class 객체를 참조
		System.out.println(clazz == claz);
		System.out.println(clazz == clas);
		System.out.println(claz == clas);
		
		System.out.println(clazz.getName()); // 클래스 전체 이름
		System.out.println(clazz.getSimpleName()); // 패키지 이름을 제외한 순수 클래스이름
		System.out.println(clazz.getPackage().getName()); // 패키지 이름
		System.out.println(clazz.getPackageName()); // 패키지 이름
		
		// (참고) 리플렉션
		// 이 외에도 필드/생성자/메소드 정보도 얻을 수 있는데
		// 이 정보를 얻어 활용하는 것을 자바에서는 "리플렉션"이라고 부름
		// 일반적인 앱 개발에서 잘 쓰지 않고, 주로 프레임워크/라이브러리 개발에서 쓰임
		// 예 : JPA에서 findByName() -> name 컬럼을 이용해서 찾는 SQL 자동 생성
		
		// 필드 정보 출력
		System.out.println("=== Fields ===");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println("Name: " + field.getName() 
						+ ", Type: " + field.getType().getSimpleName()
						+ ", Modifier: " + Modifier.toString(field.getModifiers()));
		}
		System.out.println();
		
		// 생성자 정보 출력
		System.out.println("=== Constructors ===");
		Constructor<?>[] constructors = clazz.getDeclaredConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println("Constructor: " + constructor.getName()
							+ ", Parameter count: " + constructor.getParameterCount());
		} 
		System.out.println();
		
		// 메소드 정보 출력
		System.out.println("=== Methods ===");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("Method: " + method.getName()
							+ ", Return type: " + method.getReturnType().getSimpleName()
							+ ", Parameter count: " + method.getParameterCount()
							+ ", Modifier: " + Modifier.toString(method.getModifiers()));
			
		}
		
	}
}
