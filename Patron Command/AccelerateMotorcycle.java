package workClasss;

public class AccelerateMotorcycle implements Command{
	
	Command command;
	Vehicle vehicle;
	
	public AccelerateMotorcycle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		vehicle.accelerate();
		
	}

	@Override
	public void revert() {
		vehicle.decelerate();
		
	}
}
