package sec02.exam01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamEx {
	
	// 파일에 문자를 저장하고, 저장된 문자를 다시 읽는 예제
	// 사용하는 소스 스트림(기본 스트림)은 바이트 기반 입출력 스트림 일 때
	// 이들 스트림을 직접 사용하지 않고 각각 Writer와 Reader로 변환해서 사용
	public static void main(String[] args) {
		try {
			write("문자 변환 스트림 사용");
//			String data = read();
			String data = read2();
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void write(String str) throws IOException {
		OutputStream os = new FileOutputStream("C:/Temp/test1.txt"); // 바이트 기반 파일 출력 스트림
		// 문자열을 바이트 배열로 변환(인코딩) 해서 출력해도 되지만
		// 편의를 위해 보조 스트림을 연결해서 문자 -> 바이트로 자동 변환
		Writer writer = new OutputStreamWriter(os, "UTF-8"); // 문자 기반 출력 보조 스트림을 연결
		writer.write(str); // 매개값으로 문자열을 바로 쓸 수 있음
		writer.flush();
		writer.close();
	}
	
	public static String read() throws IOException {
		InputStream is = new FileInputStream("C:/Temp/test1.txt"); //바이트 기반 파일 입력 스트림
		// 바이트를 읽어서 문자열로 변환(디코딩)한 다음 사용해도 되지만
		// 편의를 위해 보조 스트림을 연결해서 바이트 -> 문자로 자동 변환
		Reader reader = new InputStreamReader(is, "UTF-8"); // 문자 기반 입력 보조 스트림을 연결
		
		// 최대 100자까지 읽음(바이트 수와 상관없음)
		char[] buffer = new char[100]; // 보조 스트림 연결로 char[] 이용 가능 => 문자 경계 짤릴 위험 없음
		int readCharNum = reader.read(buffer);
		reader.close();
		
		String data = new String(buffer, 0 , readCharNum); // 인덱스 0 부터 읽어온 문자 수만큼 문자열로 만듦
		return data;
	}
	
	// 편의를 위한 추가 보조 스트림
	public static String read2() throws IOException {
//		InputStream is = new FileInputStream("C:/Temp/test1.txt");
//		Reader reader = new InputStreamReader(is, "UTF-8");
//		BufferedReader br = new BufferedReader(reader); // Reader에만 연결 가능
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Temp/test1.txt")));
		
		String data = br.readLine(); // 한 줄을 읽어 문자열로 변환해줌
		br.close();
		
		return data;
	}
}
