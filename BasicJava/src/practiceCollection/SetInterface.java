package practiceCollection;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
	
	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add('a');
		s.add('b');
		s.add('c');
		s.add('d');
		s.add('e');
		s.add('a');
		s.add(null);
		s.add(null);
		
		System.out.println(s);
		
	}

}