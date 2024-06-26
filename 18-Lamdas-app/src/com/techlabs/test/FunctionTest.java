package com.techlabs.test;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer,Double> half=(num)->num/2.0;
	
		//andThen
		// half=half.andThen(num->3*num);
		
		//compose
		half=half.compose(num->3*num);
		
		System.out.println(half.apply(5));
	
		//identify
		Function<Integer,Integer> num2=Function.identity();
		System.out.println(num2.apply(10));

		
	}

}
