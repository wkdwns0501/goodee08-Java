package sec02.exam04;

public class DriverEx {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
//		Bus bus = new Bus();
//		driver.drive(bus);
		
		driver.drive(new Bus());
		
		driver.drive(new Taxi());
	}
}
