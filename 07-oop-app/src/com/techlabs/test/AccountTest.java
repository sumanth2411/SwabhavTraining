package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Account;
import com.techlabs.model.AccountType;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		Account accounts[]=new Account[5];
		
		for(int i=0;i<accounts.length;i++) {
			accounts[i]=new Account();
			System.out.println("Enter the AccountNumber:");
			accounts[i].setAccountNumber(input.nextInt());
			System.out.println("Enter the Account Type Savings or Current:");
			String accountType=input.next();
			if(accountType.equals("Savings")) {
				accounts[i].setAccountType(AccountType.Savings);
			}
			if(accountType.equals("Current")) {
				accounts[i].setAccountType(AccountType.Current);
			}
			System.out.println("Enter the holder Name:");
			accounts[i].setName(input.next());
			System.out.println("Enter the Balance:");
			accounts[i].setBalance(input.nextFloat());
		}
		
		for(int i=0;i<accounts.length;i++) {
			System.out.println(accounts[i]);
			
		}
	}

}
