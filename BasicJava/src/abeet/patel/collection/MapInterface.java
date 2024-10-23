package abeet.patel.collection;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put(0, "jack");
		m.put(1, "oggy");
		m.put(2, 5);
		m.put(3, 2.5);
		m.put(4, 'X');
		m.put(5, true);
		
		System.out.println(" m = "+m);
		
		System.out.println(" m = "+m.keySet());
		
		System.out.println(" m = "+m.values());
		
		System.out.println(m.get(4));
		
		System.out.println(!m.isEmpty());
		
	}

}
