package com.exceptionHandling.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex4 {

	public static void main(String[] args) {
		try {
			FileInputStream fis= new FileInputStream("C:/ja");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
