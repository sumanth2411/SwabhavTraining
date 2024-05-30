package com.techlabs.playpigg;

import java.util.Random;
import java.util.Scanner;

public class PlayPiggGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random random = new Random();
	        Scanner input = new Scanner(System.in);
	        int totalScore = 0;
	        int turn = 1;

	        while (totalScore < 20) {
	            int turnScore = 0;
	            boolean turnOver = false;
	            System.out.println("TURN " + turn);

	            while (!turnOver) {
	                System.out.print("Roll or hold? (r/h): ");
	                char choice = input.next().charAt(0);

	                if (choice == 'r') {
	                    int die = random.nextInt(6) + 1; 
	                    System.out.println("Die: " + die);

	                    if (die == 1) {
	                        System.out.println("Turn over. No score.");
	                        turnOver = true;
	                    } else {
	                        turnScore += die;
	                    }
	                } 
	                else if (choice == 'h') {
	                    totalScore += turnScore;
	                    System.out.println("Score for turn: " + turnScore);
	                    System.out.println("Total score: " + totalScore);
	                    turnOver = true;
	                }
	                else {
	                    System.out.println("Invalid choice. Please enter 'r' to roll or 'h' to hold.");
	                }
	            }
	            turn++;
	        }

	        System.out.println("You finished in " + (turn - 1) + " turns!");
	        System.out.println("Game over!");

	}

}
