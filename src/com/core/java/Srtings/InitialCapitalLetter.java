package com.core.java.Srtings;

public class InitialCapitalLetter {

	public static void main(String[] args) {

		String s = "hello world fdrdtdr";
		String[] sArray = s.split("\\s");

		StringBuffer sBuffer = new StringBuffer();

		for (int i = 0; i < sArray.length; i++) {
			sBuffer.append(sArray[i].substring(0, 1).toUpperCase() + sArray[i].substring(1)+" ");
		}

		System.out.println(sBuffer);

	}

}
