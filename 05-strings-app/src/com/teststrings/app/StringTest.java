package com.teststrings.app;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tag=new String("Mr.");
		StringBuffer firstName=new StringBuffer("Sai Sumanth");
		StringBuilder lastName=new StringBuilder("Devandla");
		
		concat1(tag);
		concat2(firstName);
		concat3(lastName);
		

	}

	private static void concat3(StringBuilder lastName) {
		// TODO Auto-generated method stub
		lastName=lastName.append("Sai sumanth MR.");
		
	}

	private static void concat2(StringBuffer firstName) {
		// TODO Auto-generated method stub
		firstName=firstName.append("Devandla MR.");
		
	}

	private static void concat1(String tag) {
		// TODO Auto-generated method stub
		tag=tag+("Sai sumanth MR.");
		
	}

}
