package practice5;

public class VIPCustomer extends Customer { // Java는 상속 1개만 가능. C++은 다중 상속 가능
	
	private int agentID;
	double salesRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		this.agentID = agentID;
	}

	@Override // 상위 클래스와 method의 내용을 바꾸고 싶을 때 쓰는 annotation
	public int calcPrice(int price) {

		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다.";
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	

	
	
	
}
