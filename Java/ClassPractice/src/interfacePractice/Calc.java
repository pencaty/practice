package interfacePractice;

public interface Calc {

	double PI = 3.14; // interface �� ����� ������ ������ �� ����� ��ȯ��
	int ERROR = -999999;
	
	int add(int num1, int num2); // interface ������ abstract method�� ���� ����
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
}
