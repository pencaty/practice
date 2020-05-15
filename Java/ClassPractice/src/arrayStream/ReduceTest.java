package arrayStream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else return s2;
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {

		String[] greetings = {"Hello", "Ni hao", "Good morning"}; // reduce에 람다 식을 넣어도 되고, binary operator가 있는 class를 넣어도 된다
		
		System.out.println(Arrays.stream(greetings).reduce("",(s1, s2)->
			{ if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else return s2;
				
			}));
		
		System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());

	}

}
