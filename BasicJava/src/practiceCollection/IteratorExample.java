package practiceCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(54);
		l.add("KGF");
		l.add("KGF");
		l.add(null);
		l.add(null);
		l.add(5.2);
		l.add(true);
		
		System.out.println("List = "+l);
		
		Iterator it = l.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
			
		}
 		
	}

}
