package sec02.exam03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineEx {
	public static void main(String[] args) throws Exception {
		// 문자 기반 파일 입력 스트림
		Reader reader = new FileReader(ReadLineEx.class.getResource("language.txt").getPath());
		
		// 한 문자씩 읽는 것보다 라인(행) 단위로 문자열을 읽어 성능 향상
		BufferedReader br = new BufferedReader(reader); 
		
		while (true) {
			String data = br.readLine(); // 더 이상 데이터를 읽을 수 없을 때 null을 반환
			if (data == null) break;
			System.out.println(data);
		}
		
		br.close();
		System.out.println();
		
		// Quiz: ReadLineExample.java 파일을 읽어 콘솔에 출력해보기
		BufferedReader br2 = new BufferedReader(new FileReader("src/sec02/exam03/ReadLineEx.java"));
		int lineNo = 1;
		while (true) {
			String data = br2.readLine();
			if (data == null) break;
			System.out.println(lineNo + " " + data);
			lineNo++;
		}
		br2.close();
	}
}
