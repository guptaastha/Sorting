package org.sample.sort;

/**
 * The way we sort playing cards in hand.
 * Takes more time if reverse sorted, good for almost sorted case
 * in place algo
 */

public class InsertionSort {
	public void sort(int [] iarr) {
		int length = iarr.length;
		boolean swapped;
		for(int i = 0; i < length; i++) {
			int j;
			int key = iarr[i];
			swapped = false;
			for(j = i - 1; j >= 0; j--) {
				if(iarr[j] > key) {
					iarr[j+1] = iarr[j];
					swapped = true;
				}
			}
			if (swapped == true) {
				iarr[j+1] = key;
			}
		}
		System.out.println("Sorted Array : ");
		print(iarr);
	}
	
	public void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}
}
