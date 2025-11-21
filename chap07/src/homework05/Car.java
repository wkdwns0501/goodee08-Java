package homework05;

public class Car {
	
	Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void startEngine() {
		engine.start();
	}
	
}
