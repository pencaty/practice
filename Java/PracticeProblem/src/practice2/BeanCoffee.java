package practice2;

public class BeanCoffee {
	int money;
	
	public String buy(int money) {
		if(money == Menu.BEAN_AMERICANO) {
			this.money += money;
			return "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�.";
		}
		else if(money == Menu.BEAN_LATTE) {
			this.money += money;
			return "�� �ٹ� �󶼸� �����߽��ϴ�.";
		}
		else {
			return null;
		}
	}
}
