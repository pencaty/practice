package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("start car");
	}
	
	public void turnOff() {
		System.out.println("turn off car");
	}
	
	public void washCar() {}
	
	final public void run() { // template method. ������ X
		startCar();
		drive();
		stop();
		turnOff();
		washCar(); // Abstract Class�� �ƴ�.
	}
}
