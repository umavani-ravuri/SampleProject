package com.website.javaConceptOftheDay;

public class FindMissingNumberArray {

	public static void main(String[] args) {

		int[] arr1 = { 8, 5, 6, 3, 4, 2,1};
		System.out.println("Missing number from array arr1: " + FindMissingNumberArray.missingNumber(arr1));
		int[] arr2 = { 5, 3, 1, 2 };
		System.out.println("Missing number from array arr2: " + FindMissingNumberArray.missingNumber(arr2));

	}

	public static int missingNumber(int[] arr) {
		int n = arr.length + 1;
		int sum = (n * (n + 1)) / 2;
		int restSum = 0;
		for (int i = 0; i < arr.length; i++) {
			restSum += arr[i];
		}
		int missingNumber = sum - restSum;
		return missingNumber;
	}
}
