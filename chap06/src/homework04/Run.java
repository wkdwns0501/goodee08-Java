package homework04;

public class Run {
	public static void main(String[] args) {
		Library library = new Library();
		
		String result1 = library.concatString("문자열", "합치기");
		System.out.println(result1);
		
		int result2 = library.integerMultiplication(3, 3);
		System.out.println(result2);
		
		boolean result3 = library.checkSameString("문자열", "문자열");
		System.out.println(result3);
	}
}
