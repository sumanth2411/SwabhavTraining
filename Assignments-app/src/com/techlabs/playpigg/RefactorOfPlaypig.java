package com.techlabs.playpigg;

import java.util.Random;
import java.util.Scanner;

public class RefactorOfPlaypig {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int totalScore = 0;
	        int turnCount = 0;

	        System.out.println("Let's Play PIG!");

	        while (totalScore < 20) {
	            int turnScore = playTurn(scanner, random);
	            totalScore += turnScore;
	            turnCount++;
	            System.out.println("Total score: " + totalScore);
	        }

	        System.out.println("\nGame Over! You reached 20 points in " + turnCount + " turns.");
	        scanner.close();
	    }

	    private static int playTurn(Scanner scanner, Random random) {
	        int turnScore = 0;
	        boolean turnOver = false;

	        System.out.println("\nTurn:");

	        while (!turnOver) {
	            String choice = getPlayerChoice(scanner);
	            turnScore = handleChoice(choice, turnScore, random);
	            if (choice.equalsIgnoreCase("r") && turnScore == 0) {
	                turnOver = true;
	            } 
	            if (choice.equalsIgnoreCase("h")) {
	                turnOver = true;
	            }
	        }

	        return turnScore;
	    }

	    private static String getPlayerChoice(Scanner scanner) {
	        System.out.print("Roll or hold? (r/h): ");
	        return scanner.nextLine();
	    }

	    private static int handleChoice(String choice, int turnScore, Random random) {
	        if (choice.equalsIgnoreCase("r")) {
	            int roll = rollDice(random);
	            if (roll == 1) {
	                turnScore = 0;
	            } 
	            
	                turnScore += roll;
	            
	        }
	        return turnScore;
	    }

	    private static int rollDice(Random random) {
	        int roll = random.nextInt(6) + 1;
	        System.out.println("You rolled: " + roll);
	        if (roll == 1) {
	            System.out.println("Rolled a 1! Turn over, no points for this turn.");
	        } 
	        
	        return roll;
	    }

}
