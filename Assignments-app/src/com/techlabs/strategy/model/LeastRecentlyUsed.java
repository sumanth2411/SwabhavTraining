package com.techlabs.strategy.model;

import java.util.LinkedList;
import java.util.Map;

public class LeastRecentlyUsed implements IStrategy{

	@Override
	public void operation(Map<String, Integer> memorymap, LinkedList<String> readingorder) {
		// TODO Auto-generated method stub
		String key =readingorder.iterator().next();
        memorymap.remove(key);
	}

}
