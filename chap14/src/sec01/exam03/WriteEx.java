package sec01.exam03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {
	public static void main(String[] args) {
		
		try (OutputStream os = new FileOutputStream("C:/Temp/test3.txt")) {
			// 출력할 바이트 배열
			byte[] byteArr = {10, 20, 30, 40, 50};
			
			// 바이틑 데이터를 배열로 출력 시 범위를 지정 가능
			// 주어진 배열의 off 번째 위치부터 len개 까지의 바이트를 출력
			// 예: 1번 인덱스부터 3개를 출력
			os.write(byteArr, 1, 3); // 20 30 40
			
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
