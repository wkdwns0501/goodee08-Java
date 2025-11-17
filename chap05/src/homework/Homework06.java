package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		// 배열 늘리기
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int length = sc.nextInt();
		sc.nextLine();
		
		String[] strArray = new String[length];
		for (int i = 0; i < strArray.length; i++) {
			System.out.print((i+1) + "번째 문자열 : ");
			strArray[i] = sc.nextLine();
		}
		
		while (true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String yn = sc.nextLine();
			if (!("n".equalsIgnoreCase(yn) || "y".equalsIgnoreCase(yn))) {
				System.out.println("입력할 수 없는 값입니다.");
				continue;
			}
			
			if ("n".equalsIgnoreCase(yn)) {
				for (int i = 0; i < strArray.length; i++) {
					System.out.println(strArray[i]);
				}
				break;
			} 
			
			System.out.print("더 입력하고 싶은 개수 : ");
            int add = sc.nextInt();
            sc.nextLine();
            
            String[] copyArray = Arrays.copyOf(strArray, strArray.length+add);
            for (int i = strArray.length; i < copyArray.length; i++) {
                System.out.print((i + 1) + "번째 문자열 : ");
                copyArray[i] = sc.nextLine();
            }
            
            strArray = copyArray;
		}
		
		sc.close();
	}
}
