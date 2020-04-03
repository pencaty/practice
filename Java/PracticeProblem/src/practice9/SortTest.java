package practice9;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("choose sort method");
		System.out.println("B : bubble");
		System.out.println("Q : quick");
		System.out.println("M : merge");
		
		int input = System.in.read();
		Sort sort = null;
		
		if (input == 'B' || input == 'b') {
			sort = new BubbleSort();
		}
		if (input == 'Q' || input == 'q') {
			sort = new QuickSort();
		}
		if (input == 'M' || input == 'm') {
			sort = new MergeSort();
		}
		
		sort.ascending();
		sort.decending();
		sort.description();
		
	}

}
