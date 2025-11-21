package homework05;

public class Run {
	public static void main(String[] args) {
		
		Car gasolineCar = new Car(new GasolineEngine());
		Car electricCar = new Car(new ElectricEngine());

		gasolineCar.startEngine();
		electricCar.startEngine();
	}
}
