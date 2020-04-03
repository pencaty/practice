package practice12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CustomerTest {

	public static void main(String[] args) {

		Customer Lee = new Customer(1, "lee", 40);
		Customer Kim = new Customer(2, "kim", 20);
		Customer Hong = new Customer(3, "hong", 13);
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(Lee);
		customerList.add(Kim);
		customerList.add(Hong);
		
		Stream<Customer> sList = customerList.stream();
		sList.forEach(c->System.out.print(c.getCustomerName() + " "));
		System.out.println();
		
		customerList.stream().map(c->c.getCustomerName()).forEach(s->System.out.print(s + " "));
		System.out.println();
		System.out.println(customerList.stream().mapToInt(c->c.getCost()).sum());
		System.out.println();
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getCustomerName()).sorted().forEach(s->System.out.print(s + " "));

	}

}
