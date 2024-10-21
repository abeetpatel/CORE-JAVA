package abeet.patel.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethods {
	
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add(5);
		c1.add("RAM");
		c1.add('a');
		c1.add(10.5);
		c1.add(true);
		
		System.out.println("c1 = "+c1);
		
		Collection c2 = new ArrayList();
		
		c2.add(10);
		c2.add("SHYAM");
		c2.add('b');
		c2.add(45.0);
		c2.add(false);
		
		System.out.println("c2 = "+c2);
		
		System.out.println(c1.containsAll(c2));
		
		System.out.println(c1.contains(false));
		
		System.out.println(c1.isEmpty());
		
		c1.remove("RAM");
		
		System.out.println("c1 = "+c1);
		
		c1.add("RAM");
		
		System.out.println("c1 = "+c1);
		
		c1.addAll(c2);
		
		System.out.println("c1 = "+c1);
		
		c1.removeAll(c2);
		
		System.out.println("c1 = "+c1);
		
		c1.retainAll(c1);
		
		System.out.println("c1 = "+c1);
		
		System.out.println(c1.size());
		
		
		System.out.println("c1 = "+c1);
		
	}

}
