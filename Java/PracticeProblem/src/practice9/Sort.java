package practice9;

public interface Sort {

	void ascending();
	void decending();
	
	default void description() {
		System.out.println("Sorting");
	}
	
}
