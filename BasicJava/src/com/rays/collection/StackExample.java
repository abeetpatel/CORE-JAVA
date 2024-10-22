package com.rays.collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack s = new Stack();

		for (char i = 'a'; i <= 'z'; i++) {

			s.push(i);

		}

		Stack s1 = new Stack();

		System.out.println("s = " + s);

		while (!s.isEmpty()) {

			s1.push(s.pop());

		}
		
		System.out.println("---------");
		
		System.out.println("s1 = " + s1);
	}

}
