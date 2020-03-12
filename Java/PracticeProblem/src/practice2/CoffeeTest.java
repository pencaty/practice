package practice2;

public class CoffeeTest {
	public static void main(String[] args) {
		Person kim = new Person("Kim", 10000);
		Person lee = new Person("Lee", 5000);
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		kim.buyStarCoffee(starCoffee, Menu.STAR_AMERICANO);
		lee.buyBeanCoffee(beanCoffee, Menu.BEAN_LATTE);
		
	}
}
