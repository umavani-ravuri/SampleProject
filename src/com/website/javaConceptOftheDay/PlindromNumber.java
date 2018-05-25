package com.website.javaConceptOftheDay;

public class PlindromNumber {

	public static void main(String[] args) {
		int value = 153;
		int temp = value;
		int r,sum = 0;

		while (value > 0) {
			
			r=value%10;
			value=value/10;
			sum=sum*10+r;
		}
		
		System.out.println(sum);
	}

}
