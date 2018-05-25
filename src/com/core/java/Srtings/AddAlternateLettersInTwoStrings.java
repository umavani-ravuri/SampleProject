package com.core.java.Srtings;

public class AddAlternateLettersInTwoStrings {

	public static void main(String[] args) {

		String s = "acegi";
		char[] c1 = s.toCharArray();
		String s2 = "bdfhjk";
		char[] c2 = s2.toCharArray();

		char[] temp = new char[30];

		int k = 0;
		for (int i = 0; i <= c1.length - 1; i++) {

			if (i >= c2.length) {
				temp[k] = c1[i];
				k = k + 1;
			} else {
				temp[k] = c1[i];
				k = k + 2;
			}

		}
		int l = 1;
		for (int j = 0; j <= c2.length - 1; j++) {
			
			if(j >= c1.length) {
			temp[l] = c2[j];
			l = l + 1;
			}
			else {
				temp[l] = c2[j];
				l = l + 2;
			}
		}

		for (int i = 0; i < temp.length - 1; i++) {
			System.out.print(temp[i]);
		}
		
		

	}

	@Override
	public String toString() {
		return "Hi";
	}
}
