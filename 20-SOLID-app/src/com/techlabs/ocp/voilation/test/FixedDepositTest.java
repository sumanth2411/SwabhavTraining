package com.techlabs.ocp.voilation.test;

import com.techlabs.ocp.voilation.model.FestiavalType;
import com.techlabs.ocp.voilation.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedDeposit fixedDeposit=new FixedDeposit(2424,"sumanth",1000,5,FestiavalType.DIWALI);
		System.out.println("Intrest for NEWYEAR:"+fixedDeposit.calculateSimpleIntrest());
		
	}

}
