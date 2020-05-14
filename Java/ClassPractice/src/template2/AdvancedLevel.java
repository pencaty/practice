package template2;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("run fast");
		
	}

	@Override
	public void jump() {
		System.out.println("jump fast");
		
	}

	@Override
	public void turn() {
		System.out.println("cannot turn");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("==Advanced Level==");
		
	}
	
}
