package homework01;

public class Run {
	public static void main(String[] args) {
		String song = "나비야, 나비야 이리 날아오너라"
				+ "\n노랑나비, 흰 나비 춤을 추며 오너라"
				+"\n봄바람에 꽃잎도 방긋방긋 웃으며"
				+ "\n참새도 짹짹짹 노래하며 춤춘다";
		
		Practice practice = new Practice();
		
		long start1 = System.nanoTime();
		practice.method1(song);
		long end1 = System.nanoTime();
		System.out.println("method1(버퍼 미사용): " + (end1 - start1) + "ns");

		long start2 = System.nanoTime();
		practice.method2(song);
		long end2 = System.nanoTime();
		System.out.println("method2(버퍼 사용): " + (end2 - start2) + "ns");	
	}
}
