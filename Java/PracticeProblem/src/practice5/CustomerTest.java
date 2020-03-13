package practice5;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer Lee = new Customer(10010, "Lee");
		Customer Shin = new Customer(10020, "Shin");
		Customer Hong = new GoldCustomer(10030, "Hong");
		Customer Yul = new GoldCustomer(10040, "Yul");
		Customer Kim = new VIPCustomer(10050, "Kim", 12345);
		
		customerList.add(Lee);
		customerList.add(Shin);
		customerList.add(Hong);
		customerList.add(Yul);
		customerList.add(Kim);
		
		System.out.println("=== Customer Info ===");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("=== Customer Price Info ===");
		
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(10000);
			System.out.println(customer.getCustomerName() + "���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint +"�� �Դϴ�.");
		}
		
		
	}

}
