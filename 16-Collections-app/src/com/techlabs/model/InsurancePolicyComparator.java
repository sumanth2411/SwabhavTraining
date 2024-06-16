package com.techlabs.model;

import java.util.Comparator;

public class InsurancePolicyComparator {
	
	public static class PolicyByName implements Comparator<InsurancePolicy>{

		@Override
		public int compare(InsurancePolicy candidate1, InsurancePolicy candidate2) {
			// TODO Auto-generated method stub
			return candidate1.getPolicyHolderName().compareTo(candidate2.getPolicyHolderName()) ;
		}
		
	}
	
	public static class PolicyByAmount implements Comparator<InsurancePolicy>{

		@Override
		public int compare(InsurancePolicy candidate1, InsurancePolicy candidate2) {
			// TODO Auto-generated method stub
			return (int)(candidate1.getAmount() - candidate2.getAmount());
		}
		
	}
	
	public static class PolicyByDate implements Comparator<InsurancePolicy>{

		@Override
		public int compare(InsurancePolicy candidate1, InsurancePolicy candidate2 ) {
			// TODO Auto-generated method stub
			return candidate1.getCreationDate().compareTo(candidate2.getCreationDate());
		}
		
	}

}
