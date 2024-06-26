package com.techlabs.test;

import java.util.function.BiPredicate;

public class PredicateCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiPredicate<Integer,Integer> biPredicate=(num1,num2)->{
			
			if(num1==num2) 
				return true;
			return false;
		};
		
		System.out.println("Are the two numbers same?"+biPredicate.test(10,10));

	}

}
