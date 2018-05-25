package com.core.java.Sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] array = { 10, 30, 20, 5, 60 };

		for (int k = 1; k < array.length - 1; k++) {
			for (int j = 0; j < array.length - 2; j++) {

				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}

	}

}
