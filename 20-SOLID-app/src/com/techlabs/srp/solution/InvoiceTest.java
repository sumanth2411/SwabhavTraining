package com.techlabs.srp.solution;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Invoice invoice=new Invoice(2424,"bike",45000);
		
		PrintInvoice invoice1=new PrintInvoice();
		invoice1.InvoicePrint(invoice);
		
		TaxCalculator invoice2=new TaxCalculator();
		invoice2.calculateTax(invoice);
		
		
	}

}
