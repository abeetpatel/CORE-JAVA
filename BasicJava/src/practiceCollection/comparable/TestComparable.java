package practiceCollection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
	
	public static void main(String[] args) {
		
		List<Marksheet> l = new ArrayList<Marksheet> ();
		
		l.add(new Marksheet("201", "Aarshi", 80, 70, 65));
		l.add(new Marksheet("202", "Abeet", 100, 80, 91));
		l.add(new Marksheet("203", "amit", 78, 57, 65));
		l.add(new Marksheet("204", "akhil", 58, 68, 48));
		
		Collections.sort(l);
		
		l.forEach(System.out::println);
		
	}

}
