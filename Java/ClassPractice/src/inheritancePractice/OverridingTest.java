package inheritancePractice;

public class OverridingTest {
	public static void main(String[] args) {
		
		Customer Lee = new Customer(10010, "Lee");
		Lee.bonusPoint = 1000;
		
		Customer Kim = new VIPCustomer(10020, "Kim");
		Kim.bonusPoint = 10000;
		
		int priceLee = Lee.calcPrice(10000);
		int priceKim = Kim.calcPrice(10000);
		
		System.out.println(Lee.showCustomerInfo() + " ���� �ݾ��� " + priceLee);
		System.out.println(Kim.showCustomerInfo() + " ���� �ݾ��� " + priceKim);
		
		

	}
}
