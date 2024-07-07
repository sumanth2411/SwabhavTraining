package com.techlabs.strategy.test;

import com.techlabs.strategy.model.FirstInFirstOut;
import com.techlabs.strategy.model.LeastFrequentlyUsed;
import com.techlabs.strategy.model.LeastRecentlyUsed;
import com.techlabs.strategy.model.StrategyEviction;

public class StrategyEvictionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrategyEviction memorymap = new StrategyEviction (new LeastRecentlyUsed());
		memorymap.put("a", 0);
		memorymap.put("b", 0);
        memorymap.put("c", 0);
        memorymap.get("a");
        memorymap.get("a");
        memorymap.get("b");
        memorymap.get("c");
        memorymap.get("b");
        memorymap.get("c");
        memorymap.put("d", 0);
        System.out.println(memorymap);
        
        memorymap = new StrategyEviction (new FirstInFirstOut());
		memorymap.put("a", 0);
		memorymap.put("b", 0);
        memorymap.put("c", 0);
        memorymap.get("a");
        memorymap.get("a");
        memorymap.get("b");
        memorymap.get("b");
        memorymap.get("c");
        memorymap.get("a");
        memorymap.put("d", 0);
        System.out.println(memorymap);
        
        memorymap = new StrategyEviction (new LeastFrequentlyUsed());
		memorymap.put("a", 0);
		memorymap.put("b", 0);
        memorymap.put("c", 0);
        memorymap.get("a");
        memorymap.get("a");
        memorymap.get("b");
        memorymap.get("b");
        memorymap.get("a");
        memorymap.get("a");
        memorymap.put("d", 0);
        System.out.println(memorymap);

	}

}
