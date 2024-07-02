package com.techlabs.strategy.test;

import com.techlabs.strategy.model.AddOperation;
import com.techlabs.strategy.model.MultiplyOperation;
import com.techlabs.strategy.model.OperationStrategy;

public class OperationStrategyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperationStrategy os=new OperationStrategy(new AddOperation());
		System.out.println(os.getDescription());
		System.out.println(os.doOperation(24, 18));
		
		
		System.out.println("-----------");
		
		
		os.setIoperation(new MultiplyOperation());
		System.out.println(os.getDescription());
		System.out.println(os.doOperation(24, 18));

	}

}
