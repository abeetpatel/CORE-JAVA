package abeet.patel.collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(6);
		l.add(4.5);
		l.add("lal");
		l.add('j');
		l.add(false);
		
		System.out.println("l = "+l);
		
		System.out.println("get 3rd index = "+l.get(2));
		
		l.remove(2);
		
		System.out.println("list after removing 3rd index = "+l);
		
		l.set(1, 6.0);
		
		System.out.println("list after seting new value in index 1 = "+l);
		
		System.out.println("sub list = "+l.subList(0, 3));
				
	}

}
