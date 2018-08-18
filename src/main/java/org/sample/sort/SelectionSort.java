package org.sample.sort;

public class SelectionSort {
	
	/**
	 * This sort selects smallest element, and put it in sequencing order
	 * 
	 */
	
	public void sort(int[] arr) {
		int length = arr.length;
		for(int i = 0 ; i < length - 1 ; i++) {
			int minIndex = i;
			for (int j = i + 1; j < length - 1; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println("Sorted Array : ");
		print(arr);
	}
	
	public void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}
}
