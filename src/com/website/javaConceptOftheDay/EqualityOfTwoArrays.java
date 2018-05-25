package com.website.javaConceptOftheDay;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {

		int[] a = { 4, 3, 2, 1, 5 };

		int[] b = { 4, 3, 2, 2, 5 };

		boolean t = true;

		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] != b[i]) {

				t = false;
			}
		}

		if (!t) {
			System.out.println("two arrays are not same");
		} else {
			System.out.println("two arrays are same");
		}

	}
}
