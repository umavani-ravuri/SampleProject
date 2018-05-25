package com.website.javaConceptOftheDay;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		String s="efdfdf";
		char[] c=s.toCharArray();
		
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
	}

}
