package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.CurrentAccount;
import com.techlabs.model.SavingsAcoount;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        SavingsAcoount savingsAccount = null;
	        CurrentAccount currentAccount = null;

	        while (true) {
	            System.out.println("Select Account Type :");
	            System.out.println("1. Savings");
	            System.out.println("2. Current");
	            System.out.println("3. Exit");
	            System.out.print("Enter Your Choice: ");
	            int accountChoice = scanner.nextInt();

	            if (accountChoice == 3) {
	                System.out.println("Thankyou!");
	                break;
	            }

	            if (accountChoice == 1) {
	                System.out.println("You chose Savings Account.");
	            } else if (accountChoice == 2) {
	                System.out.println("You chose Current Account.");
	            } else {
	                System.out.println("Invalid option. Please try again.");
	                continue;
	            }

	            while (true) {
	                System.out.println("Select Operation :");
	                System.out.println("1. Create Account");
	                System.out.println("2. Display Account Details");
	                System.out.println("3. Credit into Account");
	                System.out.println("4. Debit from Account");
	                System.out.println("5. Exit");
	                System.out.print("Enter Your Choice: ");
	                int operationChoice = scanner.nextInt();

	                if (operationChoice == 5) {
	                    break;
	                }

	                switch (operationChoice) {
	                    case 1:
	                        System.out.println("You selected creating new account. Please Enter Details:");
	                        System.out.print("Enter Account Number: ");
	                        int accNo = scanner.nextInt();
	                        System.out.print("Enter Account Holder Name: ");
	                        scanner.nextLine();  // Consume newline left-over
	                        String name = scanner.nextLine();
	                        System.out.print("Enter Opening Balance: ");
	                        double balance = scanner.nextDouble();

	                        if (accountChoice == 1) {
	                            System.out.print("Enter Minimum Balance: ");
	                            double minBalance = scanner.nextDouble();
	                            savingsAccount = new SavingsAcoount(accNo, name, balance,minBalance);
	                            System.out.println("Your Savings Account is created.");
	                        } else if (accountChoice == 2) {
	                            System.out.print("Enter Overdraft Limit: ");
	                            double overdraftLimit = scanner.nextDouble();
	                            currentAccount = new CurrentAccount(accNo, name, balance, overdraftLimit);
	                            System.out.println("Your Current Account is created.");
	                        }
	                        break;
	                    case 2:
	                        if (accountChoice == 1 && savingsAccount != null) {
	                            System.out.println(savingsAccount);
	                        } else if (accountChoice == 2 && currentAccount != null) {
	                            System.out.println(currentAccount);
	                        } else {
	                            System.out.println("No account created yet.");
	                        }
	                        break;
	                    case 3:
	                        System.out.print("Enter Amount to credit: ");
	                        double creditAmount = scanner.nextDouble();
	                        if (accountChoice == 1 && savingsAccount != null) {
	                            savingsAccount.credit(creditAmount);
	                        } else if (accountChoice == 2 && currentAccount != null) {
	                            currentAccount.credit(creditAmount);
	                        } else {
	                            System.out.println("No account created yet.");
	                        }
	                        break;
	                    case 4:
	                        System.out.print("Enter Amount to debit: ");
	                        double debitAmount = scanner.nextDouble();
	                        if (accountChoice == 1 && savingsAccount != null) {
	                            savingsAccount.debit(debitAmount);
	                        } else if (accountChoice == 2 && currentAccount != null) {
	                            currentAccount.debit(debitAmount);
	                        } else {
	                            System.out.println("No account created yet.");
	                        }
	                        break;
	                    default:
	                        System.out.println("Invalid option. Please try again.");
	                        break;
	                }
	            }
	        }

	        scanner.close();
	    }

}
