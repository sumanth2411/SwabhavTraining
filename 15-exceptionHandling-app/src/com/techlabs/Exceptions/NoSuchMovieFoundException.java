package com.techlabs.Exceptions;

public class NoSuchMovieFoundException extends RuntimeException {
	public String getMessage() {
		return "Movie not found.";
	}


}
