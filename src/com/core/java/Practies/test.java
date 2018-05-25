package com.core.java.Practies;

public	class test implements Cloneable{

		int i;

		int j;

		@Override
		public String toString() {
			return "test [i=" + i + ", j=" + j + "]";
		}

		 @Override
		 public Object clone() throws CloneNotSupportedException {
		 return super.clone();
		 }
	}

