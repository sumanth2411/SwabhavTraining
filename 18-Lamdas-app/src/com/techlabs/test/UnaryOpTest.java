package com.techlabs.test;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnaryOperator<Integer> xor = a -> a ^ 1; 
		
		//andThen
		UnaryOperator<Integer> and = a -> a & 1;
		Function<Integer,Integer> num=xor.andThen(and);
		
		//compose
		Function<Integer, Integer> compose = xor.compose(and);
		
		
        System.out.println(compose.apply(2)); 
        
        
        //identify
        UnaryOperator<Boolean> op = UnaryOperator.identity(); 
        System.out.println(op.apply(true));
        
        

	}

}
