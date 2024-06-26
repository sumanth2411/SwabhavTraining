package com.techlabs.test;

import java.util.Arrays;
import java.util.List;

import com.techlabs.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Account> accounts = Arrays.asList(
	                new Account(1, "sumanth", 1500.0),
	                new Account(2, "sai", 2500.0),
	                new Account(3, "hari", 1200.0),
	                new Account(4, "sohail", 500.0),
	                new Account(5, "satish", 3000.0)
	        );
		 
		 System.out.println("Account details with minimum balance");
		// accounts.stream().min(comparator.)

	}

}
