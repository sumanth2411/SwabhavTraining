package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.InputValidator;

public class InputValidatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputValidator Validate= new InputValidator();
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String UserName=input.nextLine();
		System.out.println("validation: "+ Validate.checkingUsername(UserName));

		System.out.println("Enter a password:");
	    String password = input.nextLine();
	    System.out.println("validation: " + Validate.checkingPassword(password));

	       
	    System.out.println("Enter an email:");
	    String email = input.nextLine();
	    System.out.println("validation: " + Validate.checkingEmail(email));
	}

}