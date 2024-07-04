package com.techlabs.state.model;

public class OutOfStockState implements VendingMachine{

	@Override
	public void handleRequest() {
		// TODO Auto-generated method stub
		System.out.println("Out of stock state: Product unavailable. Please select another product.");
		
	}

}
