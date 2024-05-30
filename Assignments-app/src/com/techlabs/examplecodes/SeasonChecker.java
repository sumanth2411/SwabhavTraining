package com.techlabs.examplecodes;

import java.util.Scanner;

public class SeasonChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int month = input.nextInt();

        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Summer";
                break;
            case 6:
            case 7:
            case 8:
                season = "Monsoon";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "please enter valid month number";
                break;
        }

        System.out.println("The season for month " + month + " is: " + season);


	}

}
