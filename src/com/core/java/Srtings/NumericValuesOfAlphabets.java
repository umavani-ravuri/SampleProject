package com.core.java.Srtings;

public class NumericValuesOfAlphabets {

	public static void main(String[] args) {
		NumericValuesOfAlphabets n=new NumericValuesOfAlphabets();
		
		n.forCapitalLetters();
		n.forSmallLetters();
		n.forCombination();
		
	}
	
	private void forCapitalLetters() {
		String s = "ABFGVGHZ";
		char [] input = s.toCharArray();
		
		for(char c : input){
			int temp = (int)c;
			/**int temp_temp = 64;
			if(temp<=90 && temp>=65){
				System.out.print(temp-temp_temp);
			}*/

			int aphaNumeric=64-temp;
			System.out.print(aphaNumeric);
			
		}
	}

	private void forSmallLetters() {
		String s = "abcdef";
		char [] input = s.toCharArray();
		
		for(char c : input){
			int temp = (int)c;
			/**int temp_temp = 96;
			if(temp<=122 && temp>=97){
				System.out.print(temp-temp_temp);
			}*/

			int aphaNumeric=96-temp;
			System.out.print(aphaNumeric);
			
		}
	}

	private void forCombination() {
		String s = "GSTsfdfsdf";
		char [] chArray = s.toCharArray();
		for(char c : chArray){
			int temp = (int)c;

			if(temp >=65 && temp<=90){

				int aphaNumeric=64-temp;
				System.out.print(aphaNumeric);
			}else{

				int aphaNumeric=96-temp;
				System.out.print(aphaNumeric);
			}
		}
	}
}
