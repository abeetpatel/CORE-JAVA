package practiceCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add('a');
		
		l.add('c');
		
		l.add('b');
		
		l.add('e');
		
		l.add('d');
		
		System.out.println("Normal list = "+l);
		
		Collections.shuffle(l);
		
		System.out.println("list in random order = "+l);
		
		Collections.sort(l);
		
		System.out.println("list in sorting order = "+l);
		
	}

}
