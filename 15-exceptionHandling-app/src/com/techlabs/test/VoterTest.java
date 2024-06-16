package com.techlabs.test;

import com.techlabs.Exceptions.AgeNotValidException;
import com.techlabs.model.Voter;

public class VoterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Voter candidate1=new Voter("Sumanth",17);
			candidate1.vote();	
		}
		catch(AgeNotValidException e) {
			System.out.println(e.getMessage());
		}

	}

}
