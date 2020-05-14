package array;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] arr1 = new int[] {1, 2, 3, 4, 5}; 
		int[] arr2 = new int[] {10, 20, 30, 40, 50};
		
		System.arraycopy(arr1, 2, arr2, 1, 3);
		for(int i = 0 ; i < arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
		System.out.println("");
		
		arr1[2] = 1000;
		
		for(int i = 0 ; i < arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
		System.out.println("");
		
		for(int i : arr1) {
			System.out.print(i+ " ");
		}
		System.out.println("");
		
		int[][] arr = {{1, 2, 3}, {4, 5, 6}};
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		
		
		
	}
}
