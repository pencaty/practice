package interface_practice;

public interface Calc {

	double PI = 3.14; // interface �� ����� ������ ������ �� ����� ��ȯ��
	int ERROR = -999999;
	
	int add(int num1, int num2); // interface ������ abstract method�� ���� ����
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("implement calculator");
		//myMethod();
	}
	
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		//mystaticMethod();
		return total;
	}
	
	/*
	private void myMethod() { // private method�� Java 1.9 ���� ����
		System.out.println("private method");
	}
	
	private static void mystaticMethod() {
		System.out.println("static private method");
	}
	 */
}
