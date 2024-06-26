package com.techlabs.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(10,25,30,45,50,65);
		
		//Stream<Integer> numberStream=numbers.stream();
		
		System.out.println("all number added by 5");
		numbers.stream().forEach((x)->System.out.println(x+5));
		
		System.out.println("all odd numbers");
		numbers.stream().filter((x)->x%2!=0).forEach((x)->System.out.println(x));
		
		List<Integer> evenNumbers=numbers.stream().filter((x)->x%2==0).collect(Collectors.toList());
		
		System.out.println("all the even numbers");
		evenNumbers.stream().forEach((x)->System.out.println(x));
		
		int addition=numbers.stream().reduce(0,(sum,x)->sum+x);
		System.out.println("Sum of elements of list:"+addition);
		
		System.out.println("After Multiplying with 5");
		
		List<Integer> Multiplyers=numbers.stream().map((x)->x*5).collect(Collectors.toList());
		Multiplyers.forEach((x)->System.out.println(x));
		
		System.out.println("All elements in ");
		
	}

}
