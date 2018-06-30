package javapoint;

public class Example8 {
	
	static void insertionSort(int[] array) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i+1] = array[i];
				i--;
			}
			array[i+1] = key;
		}
	}

	public static void main(String[] args) {
		int[] arr = {9,14,3,2,43,11,58,22};
		System.out.println("Array Before Insertion Sort");
		for (int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		insertionSort(arr);
		System.out.println("Array After Insertion Sort");
		for (int i:arr) {
			System.out.print(i + " ");
		}
	}

}
