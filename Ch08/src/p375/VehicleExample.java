package p375;

import p374.Bus;
import p374.Vehicle;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare();	Vehicle 인터페이스에는 checkFare() 없음
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
	}
}
