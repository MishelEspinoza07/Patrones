package workClasss;

public class Truck implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("The Truck is accelerating");
		
	}

	@Override
	public void decelerate() {
		System.out.println("The Truck is decelerating");
		
	}

	@Override
	public void start() {
		System.out.println("The Truck is starting");		
	}

	@Override
	public void stop() {
		System.out.println("The Truck is stopping");
		
	}

}