package interface_practice;

public abstract class Calculator implements Calc { // 모든 abstract method를 전부 구현하는 것이 아니면 abstract class가 됨

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}


}
