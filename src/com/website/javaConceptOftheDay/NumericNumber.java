package com.website.javaConceptOftheDay;

public class NumericNumber {

	public static void main(String[] args) {

		String s = "abc";

		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {

			System.out.println("Given value is not number format");
		}

	}

}
