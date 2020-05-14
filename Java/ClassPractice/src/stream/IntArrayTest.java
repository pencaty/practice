package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		int sum = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count(); // stream 재사용 불가. 다시 쓰고 싶으면 다시 선언해야함
		
		System.out.println(sum);
		System.out.println(count);
		
		System.out.println(Arrays.stream(arr).reduce(0, (a,b)->a+b)); // reduce : 직접 연산 정의
		

	}

}
