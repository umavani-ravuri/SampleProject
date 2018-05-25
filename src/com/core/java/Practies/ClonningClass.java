package com.core.java.Practies;

public class ClonningClass {

	public static void main(String[] args) throws CloneNotSupportedException {

	/*test obj1 = new test();
		obj1.i = 10;
		obj1.j = 20;
		System.out.println("before Object 1 values"+obj1);

		test obj2 = obj1;
		
		System.out.println("before Object 2 values"+obj2);

		obj2.i=40;
		
		System.out.println("After Object 1 values"+obj1);
		System.out.println("After Object 2 values"+obj2);*/
		
		
		
		
		/*test obj1 = new test();
		obj1.i = 10;
		obj1.j = 20;
		System.out.println("before Object 1 values"+obj1);

		test obj2 = new test();
		obj2.i=obj1.i;
		obj2.j=obj1.j;
		
		
		System.out.println("before Object 2 values"+obj2);

		obj2.i=40;
		
		System.out.println("After Object 1 values"+obj1);
		System.out.println("After Object 2 values"+obj2);*/
		
		
		test obj1 = new test();
		obj1.i = 10;
		obj1.j = 20;
		System.out.println("before Object 1 values"+obj1);

		test obj2 =(test)obj1.clone();
		//obj2.i=obj1.i;
		//obj2.j=obj1.j;
		
		
		System.out.println("before Object 2 values"+obj2);

		obj2.i=40;
		
		System.out.println("After Object 1 values"+obj1);
		System.out.println("After Object 2 values"+obj2);
		
		
		
	
	}
}

