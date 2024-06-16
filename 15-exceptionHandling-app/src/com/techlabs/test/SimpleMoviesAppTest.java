package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.SimpleMoviesApp;

public class SimpleMoviesAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        SimpleMoviesApp app = new SimpleMoviesApp();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display all movies");
            System.out.println("2. Add a movie");
            System.out.println("3. Display a particular movie by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    app.displayMovies();
                    break;
                case 2:
                    System.out.print("Enter movie ID: ");
                    int movieId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter movie name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter movie genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter movie year: ");
                    int year = scanner.nextInt();
                    app.addMovie(movieId, name, genre, year);
                    break;
                case 3:
                    System.out.print("Enter movie ID to display: ");
                    int id = scanner.nextInt();
                    app.displayMovieById(id);
                    break;
                case 4:
                    System.out.println("ThankYou!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();

	}

}
