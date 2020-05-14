package abstract_practice;

public abstract class Computer { // 하나의 추상 method를 포함하더라도 abstract class가 된다. abstract class는 instance화 (new를 사용하여 instance 생성) 불가능
	
	public abstract void display(); // 추상class - 하위 class에서 쓰임
	// public void display() {} : 추상class 아님
	
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("turn on");
	}
	
	public void turnOff() {
		System.out.println("turn off");
	}
}
