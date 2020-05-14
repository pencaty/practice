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
		
		static void sTest() { // static class �ȿ��� static method ���� ����
			//System.out.println(inNum); //inNum�� InStaticClass�� ������ �Ŀ��� ��� �����ϹǷ� ���⼱ ��� �Ұ���
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
