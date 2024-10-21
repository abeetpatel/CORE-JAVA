package com.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put(1, "two");
		m.put(2, "one");
		m.put(3, "three");
		m.put(4, "four");
		
		System.out.println(m.get(3));
		
		System.out.println(m.entrySet());
		
		System.out.println(!m.isEmpty());
		
		System.out.println(m.values());
		
	}

}
