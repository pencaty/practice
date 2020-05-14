package string;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc"); // 각각 heap memory에 allocate 됨
		
		System.out.println(str1 == str2);
		
		String str3 = "abc";
		String str4 = "abc"; // 상수풀에 있는 데이터 가져온 것
		
		System.out.println(str3 == str4);
		
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(android);
		System.out.println(java);
		System.out.println(System.identityHashCode(java)); // String : immutable -> 새로운 address를 가리킴

	}

}
