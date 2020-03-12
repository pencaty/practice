package practice2;

public class StarCoffee {
	int money;
	
	public String buy(int money) {
		if(money == Menu.STAR_AMERICANO) {
			this.money += money;
			return "별 다방 아메리카노를 구입했습니다.";
		}
		else if(money == Menu.STAR_LATTE) {
			this.money += money;
			return "별 다방 라떼를 구입했습니다.";
		}
		else {
			return null;
		}
	}
}
