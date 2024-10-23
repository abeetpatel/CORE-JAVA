package abeet.patel.collection;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
	
	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add(5);
		s.add(3);
		s.add(1);
		s.add(2);
		s.add(4);
		s.add(null);
		s.add(null);
		s.add(4);
		s.add(4);
		
		System.out.println(s);
		
	}

}
