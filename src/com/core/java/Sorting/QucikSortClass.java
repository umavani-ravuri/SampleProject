package com.core.java.Sorting;

public class QucikSortClass {

	public static void main(String[] args) {
		QucikSortClass q = new QucikSortClass();

		int[] arrayVal = { 9, 6, 5, 0, 8, 2, 4,7 };
		q.quickSort(arrayVal);

	}

	public void quickSort(int[] arrayVal) {

		Partition(arrayVal);

	}

	private static int Partition(int[] arrayVal1) {

		int pivot = arrayVal1[arrayVal1.length - 1];

		int i = 0;

		for (int j = 0; i < arrayVal1.length - 1; j++) {

			if (arrayVal1[j] < pivot) {

				i = i + 1;
				int temp = arrayVal1[j];
				arrayVal1[j] = arrayVal1[i];
				arrayVal1[i] = temp;
			}
		}

		int temp = arrayVal1[arrayVal1.length-1];
		arrayVal1[arrayVal1.length-1] =arrayVal1[i+1];
		arrayVal1[i+1]=temp;
		
		
		return i+1;

	}

}
