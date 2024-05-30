package com.techlabs.atm;

import java.util.Scanner;

public class MoneyCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = input.nextInt();
        
        if (amount > 0 && amount < 50000 && amount%100==0) {
            int NoOf2000s = amount / 2000;
            amount %= 2000;
            int NoOf500s = amount / 500;
            amount %= 500;
            int NoOf200s = amount / 200;
            amount %= 200;
            int NoOf100s = amount / 100;

            System.out.println("No. of 2000s: " + NoOf2000s);
            System.out.println("No. of 500s: " + NoOf500s);
            System.out.println("No. of 200s: " + NoOf200s);
            System.out.println("No. of 100s: " + NoOf100s);
        } 
        else {
            System.out.println("Please enter an amount less than 50000 and multiple of 100.");
        }
		

	}

}
