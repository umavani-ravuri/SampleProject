package com.website.javaConceptOftheDay;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int value = 153;
		int temp = value;
		int sum=0;
		int r=0;
		

		while(value>0) {
			r= value% 10;
			sum=sum+(r*r*r);
			value=value/10;
		}
		
		if(temp == sum) {
			System.out.println("this is arm strong");
		}
		else {
			System.out.println("this is not armstrong");
		}


	}

}
