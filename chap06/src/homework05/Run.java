package homework05;

public class Run {
	public static void main(String[] args) {
		Library library = new Library();
		
		String result1 = library.printMessage("메세지");
		System.out.println(result1);
		
		int result2 = library.plus1To100();
		System.out.println("1부터 100까지의 합: " + result2);
		
		String result3 = library.checkOddEven(2);
		System.out.println(result3);
		
		String result4 = library.containEng("가나다java") 
				? "영문자가 있습니다." : "영문자가 없습니다." ;
		System.out.println(result4);
		
		int result5 = library.containChar("abcedfsc", 'c');
		System.out.println(result5+ "개 포함");
		
		library.gugudan(2);
	}
}