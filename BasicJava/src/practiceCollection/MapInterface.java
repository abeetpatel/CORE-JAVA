package practiceCollection;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(1, "ram");
		m.put(2, "shyam");
		m.put(3, "jay");
		m.put(4, "veeru");
		
		System.out.println(m.get(3));
		
		System.out.println(m.entrySet());
		
		System.out.println(!m.isEmpty());
		
		System.out.println(m.values());
		
		System.out.println(m.keySet());
		
	}

}
