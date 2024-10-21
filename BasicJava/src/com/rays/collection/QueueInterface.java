package com.rays.collection;

import java.util.ArrayDeque;
import java.util.Queue;

// fifo
public class QueueInterface {
	
	public static void main(String[] args) {
		
		Queue q = new ArrayDeque();
		
		q.offer('a');
		q.offer('b');
		q.offer('c');
		q.offer('d');
		q.offer('e');
		
		System.out.println(q);
		
		System.out.println("peek get only first element = " + q.peek());
		
		System.out.println(q);
		
		System.out.println("poll remove only first element = " + q.poll());		
		
		System.out.println(q);
		
		q.poll();
		
		
	}

}
