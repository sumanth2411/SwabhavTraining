package com.techlabs.Exceptions;

public class AgeNotValidException extends RuntimeException {
	public String getMessage() {
		return "candidate is underage";
	}

}
