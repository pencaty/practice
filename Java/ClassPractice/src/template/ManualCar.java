package template;

public class ManualCar extends Car {
	@Override
	public void drive() {
		System.out.println("Manually move");
		
	}

	@Override
	public void stop() {
		System.out.println("Manually stop");
		
	}
}
