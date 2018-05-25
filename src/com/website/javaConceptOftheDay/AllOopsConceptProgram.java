package com.website.javaConceptOftheDay;

abstract class Test {

	public void sum(int a) {
		System.out.println("this is addition of int numbers abstract class");
	}

	public void sum(float a) {
		System.out.println("this is addition of float numbers abstract class");
	}

}

class AddingValues extends Test {

	private float a;

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public void sum(float a) {
		System.out.println("this is addition of float numbers concrete class");
	}
}

public class AllOopsConceptProgram {
	public static void main(String[] args) {
		AddingValues addingValues = new AddingValues();
		addingValues.setA(10f);
		addingValues.sum(addingValues.getA());
		addingValues.sum(10);

	}

}
