package com.techlabs.Exceptions;

public class InsufficientFundsException extends RuntimeException{
	public String getMessage() {
		return "insufficient funds";
	}

}
