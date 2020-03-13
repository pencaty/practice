package templPractice2;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("run faster");
		
	}

	@Override
	public void jump() {
		System.out.println("jump faster");
		
	}

	@Override
	public void turn() {
		System.out.println("turn faster");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("==Super Level==");
		
	}
	
}
