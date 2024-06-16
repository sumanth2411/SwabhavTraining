package com.techlabs.test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1, "Sumanth");
		map.put(3, "Hari");
		map.put(2, "Raju");
		
		//System.out.println(map);
		
		Set<Map.Entry<Integer,String>> entries=map.entrySet();
		
		for(Map.Entry entry:entries) {
			System.out.println(entry.getKey()+"-----"+entry.getValue());
		}
		
		

	}

}
