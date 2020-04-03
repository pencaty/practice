package innerClassPractice;

class Outer2 {
	
	int outNum = 100;
	static int sNum = 150;
	
	Runnable getRunnable(int i) {
		int num = 200;
		return new Runnable() {
		
			@Override
			public void run() { // anonymous inner class
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
			
		};
	}
	
	Runnable runner = new Runnable() { // anonymous inner class

		@Override
		public void run() {
			System.out.println("test");
		}
		
	};
}

public class AnonymousInnerClass {

	public static void main(String[] args) {

		Outer2 outer = new Outer2();
		Runnable runnable = outer.getRunnable(50);
		runnable.run();
		
		outer.runner.run();

	}

}
