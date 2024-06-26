package com.techlabs.srp.solution;

public class PrintInvoice {
	
		 public void InvoicePrint(Invoice invoice) {
		        System.out.println("Invoice ID: " + invoice.getId());
		        System.out.println("Description: " + invoice.getDescription());
		        System.out.println("Amount: " + invoice.getAmount());
		        System.out.println("Tax: " + invoice.getTax());
		      
		    }
	

}
