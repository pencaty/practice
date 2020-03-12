package practice2;

public class BeanCoffee {
	int money;
	
	public String buy(int money) {
		if(money == Menu.BEAN_AMERICANO) {
			this.money += money;
			return "콩 다방 아메리카노를 구입했습니다.";
		}
		else if(money == Menu.BEAN_LATTE) {
			this.money += money;
			return "콩 다방 라떼를 구입했습니다.";
		}
		else {
			return null;
		}
	}
}
