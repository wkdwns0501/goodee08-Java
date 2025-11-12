package sec04.exam02;

import java.io.IOException;

public class KeyCodeEx {
	public static void main(String[] args) throws IOException { // 발생한 예외를 모니터(콘솔)에 출력하고 끝내라
		int keyCode;
		
		// 키보드로부터 키코드를 읽어올 때 예외가 발생할 수 있음 -> 예외처리(추후 학습)
		keyCode = System.in.read(); // 콘솔에서 키보드로부터 입력을 받을 때까지 기다림(입력이 없으면 멈춰있음)
		System.out.println("keyCode: " + keyCode); // 내가 입력한 문자 + 엔터 (13 10) - 버퍼안에 3개가 들어감
		keyCode = System.in.read(); 						// read는 출력을 1바이트 밖에 못하기 때문에 3번 read를 해야 모두 출력
		System.out.println("keyCode: " + keyCode); // 13
		keyCode = System.in.read(); 
		System.out.println("keyCode: " + keyCode); // 10
	}
}
