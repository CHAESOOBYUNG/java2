package chapter05;

public class SelectionSort {
	public static void selectionSort(int arr[]) {
		for(int i = 0; i < arr.length - 1; i++) {
			int min = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {64, 34, 25, 12, 22, 11, 90};
		
		System.out.println("Unsorted array: ");
		for(int value : arr) {
			System.out.print(value + " ");
		}
		
		selectionSort(arr);
		
		System.out.println("\nSorted array:");
		for(int value : arr) {
			System.out.print(value + " ");
		}
	}
}
