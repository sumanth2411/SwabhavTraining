package com.techlabs.GuessNum;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1; 
        int chances = 3;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have 3 chances to guess the number between 1 and 100.");

        while (chances > 0) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Congratulations! You won in"+chances+" attempts");
                return;
            } else if (guess < randomNumber) {
                System.out.println("The number is larger.");
            } else {
                System.out.println("The number is smaller.");
            }

            chances--;
        }

        System.out.println("Game over. The number was: " + randomNumber);

	}

}
