package sec01.exam09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteEx {
	public static void main(String[] args) {
		try (Writer writer = new FileWriter("C:/Temp/test9.txt")) {
			// 배열을 이용해서 문자 데이터를 한꺼번에 출력
			char[] array = {'A', 'B', 'C'};
			
			// 배열의 모든 문자 출력
			writer.write(array);
			
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
