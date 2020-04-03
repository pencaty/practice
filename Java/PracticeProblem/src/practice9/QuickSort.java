package practice9;

public class QuickSort implements Sort {

	@Override
	public void ascending() {
		System.out.println("Quick ascending");
	}

	@Override
	public void decending() {
		System.out.println("Quick decending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("Quick Sort");
	}
	
	

}
