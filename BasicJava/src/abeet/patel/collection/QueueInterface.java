package abeet.patel.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInterface {
	
	public static void main(String[] args) {
		
		Queue q = new ArrayDeque();
		
		q.offer('e');
		q.offer('a');
		q.offer('g');
		q.offer('c');
		q.offer('f');
		q.offer('b');
		q.offer('d');
		
		System.out.println("natural way"+q);
		System.out.println("peek got only first element = "+q.peek());
		System.out.println(q);
		System.out.println("poll remove only first element = "+q.poll());
		System.out.println(q);
		q.poll();
		
	}

}
