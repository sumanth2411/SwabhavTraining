package com.techlabs.state.model;

public class VendingMachineContext {
	 private VendingMachine state;

	    public void setState(VendingMachine state) {
	        this.state = state;
	    }

	    public void request() {
	        state.handleRequest();
	    }

}
