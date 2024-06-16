package com.techlabs.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new LinkedHashSet<String>();
		
		set.add("abc");
		set.add("xyz");
		set.add("pqr");
		
		System.out.println(set);

	}

}
