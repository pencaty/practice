package lambdaPractice;

interface PrintString {
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {

		PrintString lambdaStr = s->System.out.println(s);
		lambdaStr.showString("test");

		showMyString(lambdaStr);
		
		PrintString lambdatest = returnString();
		lambdatest.showString("test3");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("test2");
	}
	
	public static PrintString returnString() {
		return s->System.out.println(s + "!");
	}

}
