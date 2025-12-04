package sec01.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {
	public static void main(String[] args) {
		// Quiz
		// 데이터 도착지를 test2.txt 파일로 하는 바이트 기반 파일 출력 스트림 생성
		try (OutputStream os = new FileOutputStream("C:/Temp/test2.txt")) {
			// 배열에 바이트 데이터를 담아서 한꺼번에 출력하면 훨씬 빠르게 출력
			// 출력할 바이트 배열
			byte[] byteArr = {10, 20, 30};
			
			// 배열의 모든 바이트를 출력
			os.write(byteArr);
			
			// 버퍼 비우기
			os.flush();
			System.out.println("저장 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
