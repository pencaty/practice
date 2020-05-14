package abstract_practice;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer computer = new Desktop();
		computer.display();
		computer.turnOff();
		
		Laptop laptop = new MyLaptop();
		

	}

}
