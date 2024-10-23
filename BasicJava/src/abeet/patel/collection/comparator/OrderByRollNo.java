package abeet.patel.collection.comparator;

import java.util.Comparator;

public class OrderByRollNo implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		
		return o1.rollNo.compareTo(o2.rollNo);
	}

}
