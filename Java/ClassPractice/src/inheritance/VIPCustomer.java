package inheritance;

public class VIPCustomer extends Customer { // Java는 상속 1개만 가능. C++은 다중 상속 가능
	
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

	@Override // 상위 클래스와 method의 내용을 바꾸고 싶을 때 쓰는 annotation
	public int calcPrice(int price) {

		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	
	
}
