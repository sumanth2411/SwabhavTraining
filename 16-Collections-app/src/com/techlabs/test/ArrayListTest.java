package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		
		list.add("Sumanth");
		list.add("22");
		list.add("Male");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);

	}

}
