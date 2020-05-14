package innerClass;

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass {
		int iNum = 100;
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
	}
	
	public void usingInner() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		int inNum = 1000;
		static int sInNum = 2000;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
		static void sTest() { // static class 안에는 static method 선언 가능
			//System.out.println(inNum); //inNum은 InStaticClass가 생성된 후에만 사용 가능하므로 여기선 사용 불가능
			System.out.println(sInNum);
			System.out.println(sNum);
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outclass = new OutClass();
		outclass.usingInner();
		
		OutClass.InClass myInclass = outclass.new InClass();
		myInclass.inTest();
		
		System.out.println();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		System.out.println();
		
		OutClass.InStaticClass.sTest();
	}

}
