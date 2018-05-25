package com.osi.spring.test;

class test {

	public test t = null;

	public test() {

	}

	public synchronized test getInstance() {

		if (t == null) {
			t = new test();
		}
		return t;
	}

}

public class FactoryMethodExample {
	public static void main(String[] args) {
		test t = new test();
		System.out.println(t.getInstance());

		test t1 = new test();
		System.out.println(t.getInstance());
	}
}