package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add('a');
		list.add('f');
		list.add('g');
		list.add('c');
		list.add('d');
		list.add('e');
		list.add('b');

		System.out.println("normal list = " + list);

		Collections.shuffle(list);

		System.out.println("list in random order = " + list);

		Collections.sort(list);

		System.out.println("list in sorting order = " + list);

	}

}
