package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.Exceptions.InsufficientFundsException;
import com.techlabs.Exceptions.NegativeAmountException;
import com.techlabs.model.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner input=new Scanner(System.in);
			System.out.println("enter the amount:");
			double amount=input.nextDouble();
			System.out.println("enter the balance:");
			double balance=input.nextDouble();
			System.out.println("enter the choice:");
			int choice=input.nextInt();
			
			System.out.println("1:Deposit");
			System.out.println("2:Withdraw");
			BankAccount account1=new BankAccount(amount,balance);
			switch(choice){
				case 1:
					account1.deposit();
					break;
				case 2:
					account1.withDraw();
					break;
			}
			
			
		}
		catch(NegativeAmountException e) {
			System.out.println(e.getMessage());
		}
		catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
