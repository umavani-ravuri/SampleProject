package com.core.java.Srtings;

public class VowelsAndConsonents {

	public static void main(String[] args) {

		String s = "aedfjkn34 etertre334";
		char[] c = s.toCharArray();

		int vowel = 0;
		int cons = 0;
		int space = 0;
		int number = 0;
		
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= '0' && c[i] <= '9') {
				number=number+1;;
			} else if (c[i] == ' ') {
				space++;

			} else if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
				vowel++;

			} else {
				cons++;
			}

		}
		System.out.println("number in string is" + number);
		System.out.println("Spaces in String is" + space);
		System.out.println("Vowels in string is" + vowel);
		System.out.println("Consonents in string is" + cons);
	}

}
