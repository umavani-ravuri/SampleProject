package com.website.javaConceptOftheDay;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random r=new Random();
		
		for(int i=1;i<10;i++) {
			
			System.out.println(r.nextInt());
			
		}

	}

}
