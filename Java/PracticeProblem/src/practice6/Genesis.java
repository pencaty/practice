package practice6;

public class Genesis extends Car {

	public Genesis() {
		this.name = "Genesis";
	}
	
	@Override
	public void start() {
		System.out.println(this.name + " start");
		
	}

	@Override
	public void drive() {
		System.out.println(this.name + " drive");
		
	}

	@Override
	public void stop() {
		System.out.println(this.name + " stop");
		
	}

	@Override
	public void turnoff() {
		System.out.println(this.name + " turnoff");
		
	}

	
	
}
