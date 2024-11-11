package practiceCollection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {
	
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add('a');
		
		c1.add("kgf");
		
		c1.add(5);
		
		c1.add(true);
		
		System.out.println("List 1 = "+c1);
		
		Collection c2 = new ArrayList();
		
		c2.add('b');
		
		c2.add("kalki");
		
		c2.add(9);
		
		c2.add(false);
		
		System.out.println("List 2 = "+c2);
		
		c1.addAll(c2);
		
		System.out.println("collection of two = "+c1);
		
		c1.removeAll(c2);
		
		System.out.println("clear elements of 2nd list = "+c1);
		
		System.out.println(c1.contains(true));
		
		System.out.println(c1.containsAll(c2));
		
		System.out.println(c1.isEmpty());
		
		c1.remove('a');
		
		System.out.println("List 1 = "+c1);
		
		c1.add('a');
		
		System.out.println("List 1 = "+c1);
		
		c1.retainAll(c1);
		
		System.out.println("List 1 = "+c1);
		
		System.out.println(c1.size());
		
		c1.clear();
		
		System.out.println("List 1 = "+c1);
		
	}

}
