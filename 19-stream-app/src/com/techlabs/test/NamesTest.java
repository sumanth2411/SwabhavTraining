package com.techlabs.test;

import java.util.Arrays;
import java.util.List;

public class NamesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=Arrays.asList("Jayesh","Nimesh","Mark","Mahesh","Ramesh");
		
		System.out.println("first three names of sorted order");
		names.stream().sorted().limit(3).forEach((x)->System.out.println(x));
		
		System.out.println("first three names conatining a letter ");
		names.stream().filter((x)->x.contains("a")).sorted().limit(3).forEach((x)->System.out.println(x));

		System.out.println("names in decending order");
		names.stream().sorted((a,b)->b.compareTo(a)).forEach((x)->System.out.println(x));
		
		System.out.println("first three characters of all names");
		names.stream().map(name -> name.length() >= 3 ? name.substring(0, 3) : name).forEach((x)->System.out.println(x));
		
		System.out.println("Names conatining less than or equal to 4 charcters");
		names.stream().filter(name->name.length()<=4).forEach(x->System.out.println(x));
		
	}

}
