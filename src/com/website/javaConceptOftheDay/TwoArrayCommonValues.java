package com.website.javaConceptOftheDay;

import java.util.HashSet;

public class TwoArrayCommonValues {

	public static void main(String[] args) {

		int[] array1 = { 10, 1, 7, 8, 3 };

		int[] array2 = { 3, 5, 6, 8, 3 };
		
		HashSet  h=new HashSet();
		
		for (int i = 0; i <= array1.length - 1; i++) {

			for (int j = 0; j <= array2.length - 1; j++) {
				
				if(array1[i] == array2[j]) {
					
					h.add(array1[i]);					
				}

			}
		}
		
		System.out.println(h);

	}

}
