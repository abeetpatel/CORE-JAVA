package abeet.patel.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add(5);
		c.add("RAM");
		c.add('a');
		c.add(10.5);
		c.add(true);
		
		System.out.println("c = "+c);
		
		System.out.println("------ForEachLoop-------");
		
		for ( Object o : c) {
			
			System.out.println(o);
			
		System.out.println("-------ForEachLoop-------");
		
		c.forEach(System.out::println);
			
		}
		
	}

}
