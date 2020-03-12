package practice2;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee coffee, int money) {
		if(this.money >= money) {
			System.out.println(this.name + " ´ÔÀÌ " + coffee.buy(money));
			this.money -= money;
		}
	}
	
	public void buyBeanCoffee(BeanCoffee coffee, int money) {
		if(this.money >= money) {
			System.out.println(this.name + " ´ÔÀÌ " + coffee.buy(money));
			this.money -= money;
		}
	}
}
