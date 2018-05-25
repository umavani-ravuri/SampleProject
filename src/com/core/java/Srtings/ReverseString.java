package com.core.java.Srtings;

public class ReverseString {

	public static void main(String[] args) {

		String s = "revertrt";
		
		String s1="trtrevero";
		
		char[] c=s1.toCharArray();
		
		for(int i=0;i<s1.length();i++) {
			
			System.out.println(s.contains(String.valueOf(c[i])));
		}
		
		

		// StringBuffer ss=new StringBuffer(s);
		// System.out.println(ss.reverse());

		/*char[] sArray = s.toCharArray();
		for(int i=sArray.length-1;i>0;i--) {
			System.out.print(sArray[i]);
		}*/
		
	}

}
