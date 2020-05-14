package interface_practice;

public class Customer implements Buy, Sell { // interface�� ������ ��� ����

	@Override
	public void sell() {
		System.out.println("customer sell");
		
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
		
	}

	@Override
	public void order() {
		//Buy.super.order(); // Buy, Sell�� �ִ� ���� �̸��� default method �� �ϳ��� �������ų�
		System.out.println("customer bubub"); // �̷��� �������ؼ� ���
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}

}
