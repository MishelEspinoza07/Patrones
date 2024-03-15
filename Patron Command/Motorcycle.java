package workClasss;

public class Motorcycle implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("The motocycle is accelerating");
		
	}

	@Override
	public void decelerate() {
		System.out.println("The motocycle is decelerating");
		
	}

	@Override
	public void start() {
		System.out.println("The motocycle is starting");		
	}

	@Override
	public void stop() {
		System.out.println("The motocycle is stopping");
		
	}

}
