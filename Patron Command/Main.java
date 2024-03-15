package workClasss;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Vehicle motoVehicle = new Motorcycle();
		StartMotorcycle startCommand = new StartMotorcycle(motoVehicle);
		GhostRider ghostRider = new GhostRider(startCommand);
		ghostRider.takeAction();
		
		AccelerateMotorcycle accelareCommand = new AccelerateMotorcycle(motoVehicle);
		ghostRider.setCommand(accelareCommand);
		ghostRider.takeAction();
		ghostRider.revertAction();
		
		Vehicle truck = new Truck();
		List<Vehicle> vehicles = List.of(motoVehicle, truck);
		StartAllVehicles startAllVehicles = new StartAllVehicles(vehicles);
		startAllVehicles.execute();
		startAllVehicles.revert();
	}
}
