package com.techlabs.codes;

public class AllTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
        
        while (number <= 10) {
            int multiplier = 1;
            while (multiplier <= 10) {
                int result = number * multiplier;
                System.out.println(result);
                
                multiplier++;
            }
            System.out.println();
            number++;
        }

	}

}
