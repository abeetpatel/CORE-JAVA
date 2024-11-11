package practiceCollection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.addElement(5);
		v.addElement(42);
		
		System.out.println(v);
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
			
		}
		
	}

}
