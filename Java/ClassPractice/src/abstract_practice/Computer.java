package abstract_practice;

public abstract class Computer { // �ϳ��� �߻� method�� �����ϴ��� abstract class�� �ȴ�. abstract class�� instanceȭ (new�� ����Ͽ� instance ����) �Ұ���
	
	public abstract void display(); // �߻�class - ���� class���� ����
	// public void display() {} : �߻�class �ƴ�
	
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("turn on");
	}
	
	public void turnOff() {
		System.out.println("turn off");
	}
}
