package templatePractice;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("AI move");
		
	}

	@Override
	public void stop() {
		System.out.println("AI stop");
		
	}
	
	@Override
	public void washCar() {
		System.out.println("AI wash");
	}

}
