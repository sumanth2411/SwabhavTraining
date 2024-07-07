package com.techlabs.strategy.model;

import java.util.LinkedList;
import java.util.Map;

public interface IStrategy {

	void operation(Map<String,Integer> memorymap,LinkedList<String> readingorder);

}
