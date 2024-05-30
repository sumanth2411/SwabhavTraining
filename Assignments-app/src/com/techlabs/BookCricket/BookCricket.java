package com.techlabs.BookCricket;

import java.util.Random;
import java.util.Scanner;

public class BookCricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		Random random=new Random();
		
		System.out.println("Enter the player 1 name:");
		String player1=input.nextLine();
		System.out.println("Enter the player 2 name:");
		String player2=input.nextLine();
		
		 int[] player1Results = playGame(player1, input);
	        int player1TotalScore = player1Results[0];
	        int player1Turns = player1Results[1];
	        
	        int[] player2Results = playGame(player2, input);
	        int player2TotalScore = player2Results[0];
	        int player2Turns = player2Results[1];

	        if (player1TotalScore > player2TotalScore) {
	            System.out.println(player1 + " is the winner");
	        } 
	        else if (player2TotalScore > player1TotalScore) {
	            System.out.println(player2 + " is the winner");
	        } 
	        else {
	            if (player1Turns < player2Turns) {
	                System.out.println(player1 + " is the winner");
	            } 
	            else if (player2Turns < player1Turns) {
	                System.out.println(player2 + " is the winner");
	            } 
	            else {
	                System.out.println("It's a tie!");
	            }
	        }

	        input.close();
	    }

	    private static int[] playGame(String playerName, Scanner scanner) {
	        Random random = new Random();
	        int totalScore = 0;
	        int turn = 0;

	        System.out.println("\n" + playerName + " Starts playing ->");

	        while (true) {
	            turn++;
	            System.out.println("Turn  -> " + turn);

	            int pageNumber = random.nextInt(300) + 1;
	            System.out.println("Page Number Generated -> " + pageNumber);

	            int score = pageNumber % 7;
	            System.out.println("Score : " + score);

	            totalScore += score;
	            System.out.println("Total Score : " + totalScore);

	            System.out.print("Continue playing -> y/n -> ");
	            String continuePlaying = scanner.nextLine();
	            if (!continuePlaying.equalsIgnoreCase("y")) {
	                System.out.println("\n" + playerName + "'s Total Score: " + totalScore + " in " + turn + " turns\n");
	                break;
	            }
	        }

	        return new int[]{totalScore, turn};
		
	}

}
