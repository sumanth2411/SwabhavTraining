package com.techlabs.examplecodes;

import java.util.Scanner;

public class PrimeNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("please enter the range:");
		int range=input.nextInt();
		int row=5;
		
		for (int i = 2; i <= range; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
            	for(int k=0; k<row; k++){   
                	for(int l=0; l<=k; l++){
                		System.out.print(i); 
                		break;
                	} 
                	System.out.println();
                	break;
            	}
             
            }
            
        }

	}

}
