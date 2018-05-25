package com.core.java.Srtings;

public class LettersOccrenceInString {
	public static void main(String[] args) {

		String s = "repeater";
		char[] c = s.toCharArray();

		int count =1;
		for (int i = 0; i < c.length; i++) {

			for (int j = i + 1; j < c.length; j++) {

				if (c[i] == c[j]) {
					count++;
					c[j] = '0';
				}
			}
			if(c[i]!='0') {
			System.out.println(" No of occurances of letter-----" + c[i] + " -----is----" + count);}
			count = 1;
		}	
	}
}
