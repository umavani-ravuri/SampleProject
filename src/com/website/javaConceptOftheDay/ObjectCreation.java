package com.website.javaConceptOftheDay;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreation {
	
	public static void main(String[] args) {
		
		Employee e3=new Employee();
		e3.empid=10;
		
		try {
			Class c=Class.forName("com.website.javaConceptOftheDay.Employee");
			try {
				Employee e2=(Employee)c.newInstance();
				e2.empid=20;
				
			} catch (InstantiationException | IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			Constructor< Employee> c=Employee.class.getConstructor();
			
			try {
				c.newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
			
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	
	}

}
