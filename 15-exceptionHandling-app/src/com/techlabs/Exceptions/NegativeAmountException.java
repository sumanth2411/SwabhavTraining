package com.techlabs.Exceptions;

public class NegativeAmountException extends RuntimeException{
	
	public String getMessage() {
		return "negitive amount can not be credited";
	}

}
