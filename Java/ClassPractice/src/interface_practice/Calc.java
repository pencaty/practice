package interface_practice;

public interface Calc {

	double PI = 3.14; // interface 내 선언된 변수는 컴파일 때 상수로 변환됨
	int ERROR = -999999;
	
	int add(int num1, int num2); // interface 내에는 abstract method만 존재 가능
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
	private void myMethod() { // private method는 Java 1.9 부터 가능
		System.out.println("private method");
	}
	
	private static void mystaticMethod() {
		System.out.println("static private method");
	}
	 */
}
