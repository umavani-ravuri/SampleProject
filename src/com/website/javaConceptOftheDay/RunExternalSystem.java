package com.website.javaConceptOftheDay;

import java.io.IOException;

public class RunExternalSystem {

	public static void main(String[] args) {
		
		Runtime r=Runtime.getRuntime();
		try {
			r.exec("notepad.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
