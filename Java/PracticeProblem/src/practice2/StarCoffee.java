package practice2;

public class StarCoffee {
	int money;
	
	public String buy(int money) {
		if(money == Menu.STAR_AMERICANO) {
			this.money += money;
			return "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.";
		}
		else if(money == Menu.STAR_LATTE) {
			this.money += money;
			return "�� �ٹ� �󶼸� �����߽��ϴ�.";
		}
		else {
			return null;
		}
	}
}
