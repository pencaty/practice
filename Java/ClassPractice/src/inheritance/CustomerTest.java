package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer Lee = new Customer(10010, "Lee");
		//Lee.setCustomerName("Lee");
		//Lee.setCustomerID(10010);
		Lee.bonusPoint = 1000;
		System.out.println(Lee.showCustomerInfo());
		
		Customer Kim = new VIPCustomer(10020, "Kim");
		//VIPCustomer Kim = new VIPCustomer(10020, "Kim");
		//Kim.setCustomerName("Kim");
		//Kim.setCustomerID(10020);
		Kim.bonusPoint = 10000;
		System.out.println(Kim.showCustomerInfo());

	}

}
