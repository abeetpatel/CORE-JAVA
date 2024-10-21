package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethos {

	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();

		c1.add(5);
		c1.add("KGF");
		c1.add('a');
		c1.add(5.2);
		c1.add(true);

		System.out.println("c1 = " + c1);
		
		Collection c2 = new ArrayList();
		
		c2.add(15);
		c2.add("KALKI");
		c2.add('b');
		c2.add(15.2);
		c2.add(false);
		
		System.out.println("c2 = " + c2);
		
		c1.containsAll(c2);
		if (true) {
			
			System.out.println("yes");
			
		}else {
			
			System.out.println("no");
			
		}
		
		c1.addAll(c2);
		System.out.println("c1 and c2 = " + c1);
		
		c2.contains("KGF");
		if (true){
			
			System.out.println("yes");
			
		}else {
			
			System.out.println("no");
			
		}
		
		c1.remove("KGF");
		System.out.println("c1 = "+c1);
		
		c1.isEmpty();
         if (true){
			
			System.out.println("yes");
			
		}else {
			
			System.out.println("no");
			
		}
		
         c1.removeAll(c2);
         System.out.println("c1 = "+c1);
         
         System.out.println(c1.size());
         
         c1.retainAll(c1);
         System.out.println("c1 = "+c1);
         
		c1.clear();
		System.out.println("c1 = "+c1);
	
	}

}
