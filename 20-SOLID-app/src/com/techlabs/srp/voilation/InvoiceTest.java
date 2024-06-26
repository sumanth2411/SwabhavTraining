package com.techlabs.srp.voilation;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Invoice invoice=new Invoice(2424,"bike",45000);
		
		invoice.calculateTax();
		invoice.printInvoice();
	}

}
