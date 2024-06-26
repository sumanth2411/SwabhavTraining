package com.techlabs.test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class PreValidEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valid="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+[.com]";
		Predicate<String> testPredicate=(email)->{
			if(Pattern.matches(valid,email)) {;
				return true;
			}
			return false;
			
			
		};
		System.out.println(testPredicate.test("saisumanth24@gmailcom"));
		
		

	}

}
