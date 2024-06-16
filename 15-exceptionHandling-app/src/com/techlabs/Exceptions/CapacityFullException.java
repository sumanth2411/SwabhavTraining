package com.techlabs.Exceptions;

public class CapacityFullException extends RuntimeException {
	public String getMessage() {
		return "Cannot add more movies. Array is full.";
	}


}
