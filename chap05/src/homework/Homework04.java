package homework;

import java.util.Arrays;

public class Homework04 {
	public static void main(String[] args) {
		// 로또 번호 자동 생성기
		int[] lotto = new int[6];
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
		        if (lotto[i] == lotto[j]) {
		            i--;
		            break;
		        }
		    }
		}
		Arrays.sort(lotto);
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
	}
}
