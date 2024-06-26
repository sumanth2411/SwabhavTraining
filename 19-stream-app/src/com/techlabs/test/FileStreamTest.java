package com.techlabs.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath = "C:\\Users\\devel\\OneDrive\\Documents\\Monojava\\19-stream-app\\src\\com\\techlabs\\test\\names";

		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
        	
            List<String> names = lines.collect(Collectors.toList());
           System.out.println("new list:"+names+"\n");

            // Filter the names to include only those that start with 'A'.
            System.out.println("names starting with A:");
            List<String> filteredNames = names.stream()
                    .filter(name -> name.startsWith("A"))
                    .map(String::toUpperCase)
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println("Filtered Names: " + filteredNames+"\n");
            

            
            List<String> upperCaseNames = names.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
            System.out.println("all names in uppercase:"+upperCaseNames+"\n");
            
            List<String> uniqueNames = names.stream()
                    .distinct()
                    .collect(Collectors.toList());
            System.out.println("removing duplicate names:"+uniqueNames+"\n");
            
            List<String> sortedNames = names.stream()
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println("All names in sorted order:"+sortedNames+"\n");
           
            // Concatenate all names into a single string separated by commas.
            String concatenatedNames = names.stream()
                    .collect(Collectors.joining(", "));
            System.out.println("Concatenated Names: " + concatenatedNames+"\n");
            
            
            // Count the number of names that do not contain 'i'.
            long count = names.stream()
                    .filter(name -> !name.contains("i"))
                    .count();
            System.out.println("Number of names without 'i': " + count+"\n");
            



            // Filter names that start with 'J', convert to uppercase, sort, and collect into a list.
            List<String> jNames = names.stream()
                    .filter(name -> name.startsWith("J"))
                    .map(String::toUpperCase)
                    .sorted()
                    .collect(Collectors.toList());

            // Print the list of 'J' names.
            System.out.println("Names starting with 'J': " + jNames);

        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
