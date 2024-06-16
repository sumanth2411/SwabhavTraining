package com.techlabs.test;

import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileReader file = new FileReader("file.txt");
        System.out.println(file.read()); 
		}
		catch(Exception e) {
			System.out.println("Error occured:"+e.getMessage());
		}
		finally {
			System.out.println("byee");
		}

	}

}
