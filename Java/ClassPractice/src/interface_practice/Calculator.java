package interface_practice;

public abstract class Calculator implements Calc { // ��� abstract method�� ���� �����ϴ� ���� �ƴϸ� abstract class�� ��

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}


}
