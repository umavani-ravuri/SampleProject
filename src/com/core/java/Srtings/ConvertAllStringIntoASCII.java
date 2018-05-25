package com.core.java.Srtings;

public class ConvertAllStringIntoASCII {

	public static void main(String[] args) {

		String stringFor = "wesdfsdf";
		char[] cArray = stringFor.toCharArray();
		for (int i = 0; i <= cArray.length-1; i++) {

			int temp = (int) cArray[i];
			System.out.println(temp);
		}
	}

}
