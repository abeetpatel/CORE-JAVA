package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(54);
		list.add("KGF");
		list.add("KGF");
		list.add(null);
		list.add(null);
		list.add(5.2);
		list.add(true);

		System.out.println("list = " + list);

		Iterator it = list.iterator();
		// fail fast
		list.add("Abeet");

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
