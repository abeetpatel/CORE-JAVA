package abeet.patel.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add(4);
		c.add("don");
		c.add('g');
		c.add(true);
		c.add(7.8);
		
		System.out.println(" c = "+c);
		
		Iterator it = c.iterator();
		
		while ( it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
	}

}
