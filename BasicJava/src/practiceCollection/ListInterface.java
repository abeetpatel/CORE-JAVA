package practiceCollection;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(54);
		l.add("KGF");
		l.add("KGF");
		l.add(null);
		l.add(null);
		l.add(5.2);
		l.add(true);
		
		System.out.println("Normal list = "+l);
		
		System.out.println("get 2nd index = "+l.get(1));
		
		l.remove(1);
		
		System.out.println("list after removing 2nd index = "+l);
		
		l.set(3,"KGF");
		
		System.out.println(l);
		
		System.out.println(l.subList(2, 5));
		
	}

}
