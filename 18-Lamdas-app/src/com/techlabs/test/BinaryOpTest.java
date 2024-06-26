package com.techlabs.test;

import java.util.function.BinaryOperator;

public class BinaryOpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<Integer> op = BinaryOperator.maxBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));

		BinaryOperator<Integer> op1 = BinaryOperator.minBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));
		
		System.out.println(op.apply(24, 18));
		System.out.println(op1.apply(24, 18));
		
		
	}

}
