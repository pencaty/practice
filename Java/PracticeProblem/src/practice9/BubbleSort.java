package practice9;

public class BubbleSort implements Sort {

	@Override
	public void ascending() {
		System.out.println("Bubble ascending");
	}

	@Override
	public void decending() {
		System.out.println("Bubble decending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("Bubble Sort");
	}
	
	

}
