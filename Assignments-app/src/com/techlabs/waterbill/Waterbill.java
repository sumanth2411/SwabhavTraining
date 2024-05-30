package com.techlabs.waterbill;

import java.util.Scanner;

public class Waterbill {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no.of units consumed:");
		int units=input.nextInt();
		int metercharge=75;
		int charge;
		
		if(units<=100) {
			charge=units*5;	
		}
		else if(units<=250) {
			charge=units*10;
		}
		else {
			charge=units*20;
		}
		
		int totalbill=charge+metercharge;
		System.out.println("the total waterbill is:"+totalbill);
		

	}

}
