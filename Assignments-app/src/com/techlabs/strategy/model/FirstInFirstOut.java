package com.techlabs.strategy.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class FirstInFirstOut implements IStrategy{

	@Override
	public void operation(Map<String, Integer> memorymap, LinkedList<String> readingorder) {
		// TODO Auto-generated method stub
		 Iterator<String> keyIterator=memorymap.keySet().iterator();
		 if(keyIterator.hasNext()) {
			 memorymap.remove(keyIterator.next());
		 }	 
	}
	
}
