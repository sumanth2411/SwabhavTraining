package com.techlabs.state.test;

import com.techlabs.state.model.OutOfStockState;
import com.techlabs.state.model.PaymentPendingState;
import com.techlabs.state.model.ProductSelectState;
import com.techlabs.state.model.ReadyState;
import com.techlabs.state.model.VendingMachineContext;

public class VendingMachineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create context
        VendingMachineContext vendingMachine = new VendingMachineContext();

        // Set initial state
        vendingMachine.setState(new ReadyState());

        // Request state change
        vendingMachine.request();

        // Change state
        vendingMachine.setState(new ProductSelectState());

        // Request state change
        vendingMachine.request();

        // Change state
        vendingMachine.setState(new PaymentPendingState());

        // Request state change
        vendingMachine.request();

        // Change state
        vendingMachine.setState(new OutOfStockState());
        
        // Request state change
        vendingMachine.request();

	}

}
