package abeet.patel.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
	
	public static void main(String[] args) {
		
		List<Marksheet> list = new ArrayList<Marksheet> ();
		
		list.add(new Marksheet("amit", "101", 45, 56, 78));
		list.add(new Marksheet("akhilesh", "102", 84, 14, 21));
		list.add(new Marksheet("yash", "104", 64, 18, 71));
		list.add(new Marksheet("pooja", "105", 54, 19, 31));
		list.add(new Marksheet("mridul", "103", 84, 84, 51));
		
		Collections.sort(list);
		
		list.forEach(System.out::println);
	}

}
