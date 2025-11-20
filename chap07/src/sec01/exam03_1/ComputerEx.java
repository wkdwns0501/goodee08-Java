package sec01.exam03_1;

public class ComputerEx {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원 면적: " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원 면적: " + computer.areaCircle(r));
		// 자식 클래스에 재정의 된 메소드 호출
	}
}
