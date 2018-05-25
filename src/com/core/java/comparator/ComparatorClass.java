package com.core.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ComparatorClass {

	public static void main(String[] args) {
		
		Company c1 = new Company(3, "sdfre");
		Company c2 = new Company(3, "sdfre");
		
		HashSet<Company> h=new HashSet<Company>();
		h.add(c1);
		h.add(c2);
		
		if(h.contains(new Company(3, "sdfre"))){
			System.out.println("equalsr");
		}

	
	/*	
		
		Company c2 = new Company(2, "bsdfsd");
		Company c3 = new Company(2, "bsdfsd");

		List<Company> l = new ArrayList<Company>();

		l.add(c1);
		l.add(c2);
		l.add(c3);
		
		
		Collections.sort();*/
		
		

	}

}
