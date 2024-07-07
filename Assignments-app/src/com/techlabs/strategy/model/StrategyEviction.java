package com.techlabs.strategy.model;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class StrategyEviction {
	LinkedList<String> readingorder;
	LinkedHashMap<String,Integer> memorymap;
	IStrategy istrategy;
	
	public StrategyEviction(IStrategy istrategy) {
		super();
		this.readingorder =new LinkedList<String>();
		this.memorymap = new LinkedHashMap<String, Integer>() ;
		this.istrategy = istrategy;
	}
	
	public void get(String key) {
		if(memorymap.containsKey(key)) {
			memorymap.put(key, memorymap.get(key)+1);
			readingorder.add(key);
		}
		
	}
	public void put(String key,int value) {
		if(memorymap.size()>=3) {
			istrategy.operation(memorymap, readingorder);
		}
		memorymap.put(key, value);
		memorymap.get(key);
		
	}

	@Override
	public String toString() {
		return "MemoryMap [readingorder=" + readingorder + ", memorymap=" + memorymap + ", istrategy=" + istrategy.getClass().getSimpleName()
				+ "]";
	}
}
