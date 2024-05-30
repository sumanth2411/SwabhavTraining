package com.techlabs.ride;

import java.util.Scanner;

public class ParkRide {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your height in cms:");
		int height=input.nextInt();
		int charge=0;
		int i=0;
		if(height>120) {
			System.out.println("You can ride.Enter your age:");
			int age=input.nextInt();
			if(age<12) {
				charge=charge+5;
			}
			else if(age==12 || age<18){
				charge=charge+7;	
			}
			else if(age==18 || age<45) {
				charge=charge+12;
			}
			else if(age>45 || age<55) {
				charge=charge+0;
			}
			else {
				System.out.println("not allowed.");
			}
			
		}
		else {
			System.out.println(" NO entry");
		}
		System.out.println("do you want photos:");
		String response=input.next();
		if(response.equals("yes")) {
				i=charge+3;
			}
		else if(response.equals("no")) {
				i =charge+0;
			}
		
		
		System.out.println("the total bill is:"+i);

	}

}
