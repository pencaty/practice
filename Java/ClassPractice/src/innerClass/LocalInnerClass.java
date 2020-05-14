package innerClass;

class Outer {
	
	int outNum = 100;
	static int sNum = 150;
	
	Runnable getRunnable(int i) {
		int num = 200; // num, i�� method �������� ��� ����. -> ����� ��޵ǰ� ���� �Ұ��� (final�� �Ƚᵵ ��)
		class MyRunnable implements Runnable {

			@Override
			public void run() {
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
			
		}
		return new MyRunnable();
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {

		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);
		runnable.run();

	}

}
