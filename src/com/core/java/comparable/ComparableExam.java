package com.core.java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExam {

	public static void main(String[] args) {

		Employee e = new Employee(2, "ama");
		Employee e1 = new Employee(1, "yani");
		Employee e2 = new Employee(0, "rani");

		List<Employee> l = new ArrayList<Employee>();
		l.add(e);
		l.add(e1);
		l.add(e2);
		Collections.sort(l);

		System.out.println(l);

	}

}
