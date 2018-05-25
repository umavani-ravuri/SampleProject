package com.website.javaConceptOftheDay;

public class DuplicateNumbersInArray {

	public static void main(String[] args) {

		int[] array = { 10, 3, 5, 10, 7, 8, 3 };

		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = i + 1; j <= array.length - 1; j++) {

				if (array[j] == array[i]) {
					array[j] = 0;
					break;
				}
				
			}
			if(array[i] != 0) {
				System.out.println(array[i]);
			}

		}

	}

}
