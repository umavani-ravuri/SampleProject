package com.core.java.Srtings;

public class StringNumericsFinding {

	public static void main(String[] args) {
		
		String s="234errerter34";
		System.out.println(s.replaceAll("[^0-9]", ""));
	}
}
