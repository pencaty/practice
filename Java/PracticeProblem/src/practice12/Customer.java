package practice12;

public class Customer {

	int customerId;
	String customerName;
	int age;
	int cost;
	
	Customer(int customerId, String customerName, int age) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.age = age;
		if(age >= 15)
			this.cost = 100;
		else
			this.cost = 50;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
