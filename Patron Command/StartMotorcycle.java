package workClasss;

public class StartMotorcycle implements Command{
	
	Command command;
	Vehicle vehicle;
	
	public StartMotorcycle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		vehicle.start();
		
	}

	@Override
	public void revert() {
		vehicle.stop();
		
	}
	
	

}