package com.techlabs.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NamesTest {

	public static void main(String[] args) {
        String filePath = "C:\\Users\\devel\\OneDrive\\Documents\\Monojava\\19-stream-app\\src\\com\\techlabs\\test\\names";
        Scanner scanner = new Scanner(System.in);
        
        try {
            // 1. Read the names from the provided text file (names.txt) and store them in a List of Strings.
            List<String> names = Files.readAllLines(Paths.get(filePath));
            System.out.println("Reading and printing all names from names.txt\n");
            names.stream().forEach(System.out::println);
            waitForUser(scanner);
            
            // 2. Filter the names to include only those that start with a specific letter (e.g., 'A').
            System.out.println("\nFilter the names to include only those that start with a specific letter\n");
            System.out.println("Enter the starting letter of name: ");
            String letter = scanner.next();
            List<String> filteredNames = names.stream()
                    .filter((x) -> x.startsWith(letter))
                    .collect(Collectors.toList());
            filteredNames.stream().forEach(System.out::println);
            waitForUser(scanner);
            
            // 3. Converting all names to uppercase
            System.out.println("\nConverting all names to uppercase\n");
            names.stream().map(String::toUpperCase).forEach(System.out::println);
            waitForUser(scanner);
            
            // 4. Sort the names alphabetically.
            System.out.println("\nSort the names alphabetically.\n");
            names.stream().sorted().forEach(System.out::println);
            waitForUser(scanner);
            
            // 5. Remove duplicate names from the list.
            System.out.println("\nRemoving duplicates from the list\n");
            names.stream().distinct().forEach(System.out::println);
            waitForUser(scanner);
            
            // 6. Collect the names into a new list.
            System.out.println("\nCollect the names into a new list.\n");
            List<String> newList = names.parallelStream().distinct().collect(Collectors.toList());
            newList.stream().forEach(System.out::println);
            waitForUser(scanner);
            
            // 7. Count the number of names that satisfy a certain condition - names that do not contain 'i'
            System.out.println("\nCount the number of names that satisfy a certain condition - names that do not contain 'i'\n");
            System.out.println("Enter letter: ");
            String letter2 = scanner.next();
            waitForUser(scanner);  // Ensure we handle the newline after next()
            long count = names.stream().filter((x) -> !x.contains(letter2)).count();
            System.out.println("The number of names which do not contain letter '" + letter2 + "' is " + count);
            waitForUser(scanner);
            
            // 8. Concatenate all the names into a single string separated by commas.
            System.out.println("\nConcatenate all the names into a single string separated by commas.\n");
            String concatenatedNames = names.stream().collect(Collectors.joining(","));
            System.out.println(concatenatedNames);
            waitForUser(scanner);
            
            // 9. Filter names that start with 'J', convert them to uppercase, sort them, and then collect them into a list.
            System.out.println("\nFilter names that start with 'J', convert them to uppercase, sort them, and then collect them into a list.\n");
            List<String> newFilteredList = names.stream()
                    .filter((x) -> x.startsWith("J") || x.startsWith("j")) // Include lowercase 'j' as well
                    .map(String::toUpperCase)
                    .sorted()
                    .collect(Collectors.toList());
            newFilteredList.stream().forEach(System.out::println);
            System.out.println("\nThankYou!!!");
            
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
    
    private static void waitForUser(Scanner scanner) {
        System.out.println("\nPress Enter to continue to see next operation");
        scanner.nextLine();
    }
		
		
}
