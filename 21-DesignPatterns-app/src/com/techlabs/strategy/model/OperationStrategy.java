package com.techlabs.strategy.model;

public class OperationStrategy implements IOperation{
	
	private IOperation ioperation;

	public IOperation getIoperation() {
		return ioperation;
	}

	public void setIoperation(IOperation ioperation) {
		this.ioperation = ioperation;
	}

	public OperationStrategy(IOperation ioperation) {
		super();
		this.ioperation = ioperation;
	}

	@Override
	public int doOperation(int a, int b) {
		// TODO Auto-generated method stub
		return ioperation.doOperation(a, b);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return ioperation.getDescription();
	}

}
