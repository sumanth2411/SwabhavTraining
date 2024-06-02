package com.techlabs.StaticDemoTest;

import com.techlabs.staticDemo.AccountCount;

public class AccountCountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountCount account1=new AccountCount();
		account1.display(24242,"sumanth",500000);
		account1.increment();
		account1.displayNoOfAccounts();
		
		AccountCount account2=new AccountCount();
		account2.display(23233,"sai",500000);
		account2.increment();
		account2.displayNoOfAccounts();
		
		AccountCount account3=new AccountCount();
		account3.display(24242,"sumanth",500000);
		account3.increment();
		account3.displayNoOfAccounts();
		
		
		
		
		
		
		

	}

}
