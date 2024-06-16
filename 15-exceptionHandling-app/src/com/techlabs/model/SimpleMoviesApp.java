package com.techlabs.model;

import com.techlabs.Exceptions.CapacityFullException;
import com.techlabs.Exceptions.NoSuchMovieFoundException;

public class SimpleMoviesApp extends Movies{

	public SimpleMoviesApp() {
		super(0, "", "", 0);
		 movies = new Movies[5];
	     count = 0;
		// TODO Auto-generated constructor stub
	}
	private Movies[] movies;
    private int count;
    
    public void addMovie(int movieId, String name, String genre, int year) {
    	try {
    		if (count < 5) {
            movies[count++] = new Movies(movieId, name, genre, year);
            System.out.println("Movie added successfully.");
            return;
    		}
    	}
    	catch(CapacityFullException e) {
    		System.out.println(e.getMessage());
    	}
        
    }
    
    public void displayMovies() {
        if (count == 0) {
            System.out.println("No movies to display.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(movies[i]);
        }
    }
    
    public void displayMovieById(int movieId) {
    	try {
    		for (int i = 0; i < count; i++) {
    			if (movies[i].getMovieId() == movieId) {
                System.out.println(movies[i]);
                return;
    			}
    		}
    	}
    	catch(NoSuchMovieFoundException e) {
    		System.out.println(e.getMessage());
    		
    	}
        
    }

}
