package com.core.java.Collections;

import java.util.HashMap;
import java.util.WeakHashMap;

import com.core.java.Srtings.AddAlternateLettersInTwoStrings;

public class HashMapExamples {

	public static void main(String[] args) {

		WeakHashMap h = new WeakHashMap<>();

		AddAlternateLettersInTwoStrings a=new AddAlternateLettersInTwoStrings();
		h.put(a, null);
		h.put(2, 1);

		System.out.println(h);

		a = null;

		System.gc();
		
		System.out.println(h);

	}

}
