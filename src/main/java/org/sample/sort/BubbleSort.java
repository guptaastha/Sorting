package org.sample.sort;

public class BubbleSort {
	/**
	 * Replace it with adjacent element. Already sorted best case
	 * 
	 * @param barr
	 */
	
	public void sort(int[] barr) {
		int length = barr.length;
		Boolean swapped;
		for (int i = 0; i < length - 1; i++) {
			swapped = false;
			for(int j = 0; j < length - i - 1; j++) {
				if(barr[j] > barr[j+1]) {
					int temp = barr[j];
					barr[j] = barr[j+1];
					barr[j+1] = temp;
					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}
		System.out.println("Sorted Array : ");
		print(barr);
	}
	
	public void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}
}
