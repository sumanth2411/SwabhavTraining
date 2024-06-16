package com.techlabs.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


import com.techlabs.model.InsurancePolicy;
import com.techlabs.model.InsurancePolicyComparator;

public class InsurancePolicyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<InsurancePolicy> candidates=new ArrayList<InsurancePolicy>();
		Scanner input=new Scanner(System.in);
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("No.Of candidates:");
		int size=input.nextInt();
		
		for(int i=0;i<size;i++) {
			System.out.println("enter policy Number:");
			int policyNumber=input.nextInt();
			System.out.println("enter policy holder Name:");
			String policyHolderName=input.next();
			System.out.println("enter Policy Amount:");
			double policyAmount=input.nextDouble();
			System.out.println("enter Policy Creation Date in format YYYY-MM-DD:");
			String creationDate=input.nextLine();
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");  
			Date date=null;
			try {
				date = sdf1.parse(creationDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			
			InsurancePolicy candidate=new InsurancePolicy(policyNumber,policyHolderName,policyAmount,date );
			candidates.add(candidate);
			
		}
		int choice;
		
		do {
            System.out.println("\nMenu:");
            System.out.println("1.Sort by Name ");
            System.out.println("2. Sort by Amount");
            System.out.println("3. Sort by Creation Date");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                	Collections.sort(candidates,new InsurancePolicyComparator.PolicyByName());
            		System.out.println(candidates);
                   
                    break;
                case 2:
                	Collections.sort(candidates,new InsurancePolicyComparator.PolicyByAmount());
            		System.out.println(candidates);
                	
                    break;
                case 3:
                	Collections.sort(candidates,new InsurancePolicyComparator.PolicyByDate());
            		System.out.println(candidates);
                    
                    break;
                case 4:
                    System.out.println("ThankYou!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        input.close();

			

	}

}
