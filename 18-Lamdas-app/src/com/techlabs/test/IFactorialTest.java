package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.IFactorial;

public class IFactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		IFactorial fact1=(int n)->{
			int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
			
		};

		System.out.println(fact1.Fact(5));
		
		
		
		
		
//		 IFactorial factorial = (int n) -> {
//	            if (n < 0) {
//	                throw new IllegalArgumentException("Number must be non-negative");
//	            }
//	            int result = 1;
//	            for (int i = 1; i <= n; i++) {
//	                result *= i;
//	            }
//	            return result;
//	        };
//	        
//	        // Test the factorial function
//	        int number = 5;
//	        int result = factorial.Fact(number);
//	        System.out.println("Factorial of " + number + " is " + result);
//
//	        // Test with another number
//	        number = 7;
//	        result = factorial.Fact(number);
//	        System.out.println("Factorial of " + number + " is " + result);
//		
		
			
		

	}

}
