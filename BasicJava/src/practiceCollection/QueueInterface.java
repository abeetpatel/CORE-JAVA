package practiceCollection;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInterface {
	
	public static void main(String[] args) {
		
		Queue q = new ArrayDeque();
		
		q.offer('a');
		q.offer('b');
		q.offer('c');
		q.offer('d');
		q.add('e');
		
		System.out.println(q);
		
		System.out.println(q.remove());
		
		System.out.println(q);
		
		System.out.println(q.element());
		
		System.out.println(q);
		
	}

}
