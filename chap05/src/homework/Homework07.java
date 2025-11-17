package homework;

import java.util.Arrays;

public class Homework07 {
	public static void main(String[] args) {
		// 배열 복사 (Arrays.copyOf 사용)
		String[] report = {"Introduction", "Research", "Conclusion"};
		String[] newReport = Arrays.copyOf(report, report.length);
		newReport[0] = "Team Feedback";
		
		System.out.print("원본 보고서: ");
		for (int i = 0; i < report.length; i++) {
			System.out.print(report[i]);
			if (i != report.length-1) {
				System.out.print(", ");
			}
		}
		
		System.out.print("\n복사된 보고서: ");
		for (int i = 0; i < newReport.length; i++) {
			System.out.print(newReport[i]);
			if (i != newReport.length-1) {
				System.out.print(", ");
			}
		}
	}
}
