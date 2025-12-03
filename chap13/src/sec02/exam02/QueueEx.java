package sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// 메세지 저장
		messageQueue.offer(new Message("sendMail", "유재석"));
		messageQueue.offer(new Message("sendSMS", "김재현"));
		messageQueue.offer(new Message("sendKakaotalk", "이미주"));
		
		// Queue를 이용한 간단한 메시지 큐를 구현한 예제
		// 먼저 넣은 메세지가 반대쪽으로 먼저 나오기 때문에 넣는 순서대로 메세지가 처리됨
		// => FIFO (선입선출)
		while (!messageQueue.isEmpty()) {
			// 메세지 큐에서 1개의 메세지 꺼냄
			Message message = messageQueue.poll();
			
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 문자을 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카톡을 보냅니다.");
				break;
			}
		}
		
	}
}
