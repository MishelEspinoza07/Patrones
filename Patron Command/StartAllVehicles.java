package workClasss;

import java.util.List;

public class StartAllVehicles implements Command{

	List<Vehicle> listVehicle;
	public StartAllVehicles(List<Vehicle> listVehicle) {
		this.listVehicle = listVehicle;
	}
	@Override
	public void execute() {
		listVehicle.forEach(listVehicle -> listVehicle.start());		
	}
	@Override
	public void revert() {
		listVehicle.forEach(listVehicle -> listVehicle.stop());		
		
	}
}
