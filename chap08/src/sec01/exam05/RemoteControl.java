package sec01.exam05;

public interface RemoteControl {
	// 상수
	// public static final이 자동으로 추가됨, 반드시 초기값 설정 필요
	int MAX_VOLUME = 10; 
	int MIN_VOLUME = 0;
	
	// 추상 메소드 (실행 블록이 없는 메소드)
	// public abstract가 자동으로 추가됨
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
