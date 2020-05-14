package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer Lee = new Customer(10010, "Lee");
		Lee.bonusPoint = 1000;
		System.out.println(Lee.showCustomerInfo());
		
		Customer Kim = new VIPCustomer(10020, "Kim");
		Kim.bonusPoint = 10000;
		System.out.println(Kim.showCustomerInfo());

	}

}
