package com.techlabs.substring;

import java.util.Scanner;

public class CheckingSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first string:");
		String str1 =input.next();
		System.out.println("Enter the second string:");
        String str2 = input.next();
        
        boolean result = isSubstring(str1, str2);
        System.out.println("Is " + str2 + " a substring of " + str1 + " ? " + result);
    }

    public static boolean isSubstring(String str1, String str2) {
        if (str2.isEmpty()) {
            return true; 
        }
        if (str1.isEmpty() || str2.length() > str1.length()) {
            return false; 
        }

        int n = str1.length();
        int m = str2.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
           
            for (j = 0; j < m; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return true; 
            }
        }
        return false; 

	}

}
