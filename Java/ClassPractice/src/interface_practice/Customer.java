package interface_practice;

public class Customer implements Buy, Sell { // interface는 여러개 상속 가능

	@Override
	public void sell() {
		System.out.println("customer sell");
		
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
		
	}

	@Override
	public void order() {
		//Buy.super.order(); // Buy, Sell에 있는 같은 이름의 default method 중 하나를 가져오거나
		System.out.println("customer bubub"); // 이렇게 재정의해서 사용
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}

}
