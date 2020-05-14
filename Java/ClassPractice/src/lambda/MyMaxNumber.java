package lambda;

@FunctionalInterface
public interface MyMaxNumber { // functional interface -> method를 1개 선언 가능.
	int getMaxNumber(int x, int y);
}
