package lambda;

public class TestMyNumber {

	public static void main(String[] args) {

		MyMaxNumber max = (x, y) -> (x  >= y) ? x : y; // lambda function. class를 정의하지 않음
		
		System.out.println(max.getMaxNumber(10, 20));

	}

}
