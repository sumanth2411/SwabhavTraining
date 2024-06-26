package com.techlabs.test;

import java.util.function.BiFunction;

public class BiFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 BiFunction<Integer, Integer, Double> add = (a, b) -> {
			 return (double) (a + b);
		 };

		// add=add.andThen(a->a*2);
		 
	     System.out.println("Sum = " + add.apply(2, 3));
	}

}
