package com.techlabs.test;

import java.util.function.Consumer;

public class ConFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> consumer=(arg)->{
			int result = 1;
            for (int i = 1; i <= arg; i++) {
                result *= i;
            }System.out.println(result);

		};
		consumer.accept(5);
	
	
	
	}
	

}
