package com.techlabs.strategy.model;

public class AddOperation implements IOperation{

	@Override
	public int doOperation(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "addition";
	}
	

}
