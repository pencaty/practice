package stringPractice;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");

		StringBuilder buffer = new StringBuilder(java); // 가변적인 char[]
		
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer)); // StringBuilder address는 그대로
		
		java = buffer.toString();
		
	}

}
