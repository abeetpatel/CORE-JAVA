	package com.rays.collection;

	import java.util.ArrayList; 
	import java.util.Collection;

	public class TestCollection {

	public static void main(String[] args) {

		Collection c = new ArrayList();

		c.add(5);
		c.add("KGF");
		c.add('a');
		c.add(5.2);
		c.add(true);

		System.out.println("c = " + c);

		System.out.println("-----forEachLoop-----");

		for (Object o : c) {
			System.out.println(o);
		}

		System.out.println("-----forEachMethod------");
		c.forEach(System.out::println);

	}

}
