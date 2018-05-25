package com.website.javaConceptOftheDay;

public class RemoveAllWhiteSpacesString {

	public static void main(String[] args) {

		String s = "hello world   sfsdfdsfs";

		String s1 = s.replaceAll("\\s", "");

		System.out.println(s1);

		char[] c = s.toCharArray();
		StringBuffer sf = new StringBuffer();
		for (int i = 0; i <= c.length - 1; i++) {

			if (c[i] != ' ' && c[i] != '\t') {

				sf.append(c[i]);
			}

		}
		System.out.print(sf);

	}

}
