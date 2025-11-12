package sec04.exam03;

import java.io.IOException;

public class CotinueKeyCodeReadEx {
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		}
	}
}
