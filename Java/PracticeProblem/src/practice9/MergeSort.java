package practice9;

public class MergeSort implements Sort {

	@Override
	public void ascending() {
		System.out.println("Merge ascending");
	}

	@Override
	public void decending() {
		System.out.println("Merge decending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("Merge Sort");
	}
	
	

}
