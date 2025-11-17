package homework;

public class Homework01 {
	public static void main(String[] args) {
		// 오름차순 정렬하기
		int[] height = {152, 180, 165, 158, 171};
		int temp = 0;
		for (int i = 0; i < height.length; i++) {
			for (int j = i+1; j < height.length; j++) {
				if (height[i] > height[j]) {
					temp = height[i];
					height[i] = height[j];
					height[j] = temp;
				}
			}
			System.out.print(height[i] + " ");
		}
		
	}
}
