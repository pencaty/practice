package inheritance;

public class VIPCustomer extends Customer { // Java�� ��� 1���� ����. C++�� ���� ��� ����
	
	double salesRatio;
	//private int agentID;
	
	/*
	public VIPCustomer() {
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		this.customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	@Override // ���� Ŭ������ method�� ������ �ٲٰ� ���� �� ���� annotation
	public int calcPrice(int price) {

		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	
	
}
