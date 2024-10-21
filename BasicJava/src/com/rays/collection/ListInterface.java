package com.rays.collection;

import java.util.ArrayList;
import java.util.List;


// list can contain multiple dubplicate values
// list can contain multiple null values
// order of list is natural order
public class ListInterface {

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
		System.out.println("get 2nd index = " + list.get(1));
		list.remove(1);
		System.out.println("list after remove 2nd index = " + list);
		list.set(0, 45);
		System.out.println(list);
		System.out.println(list.subList(0, 3));

	}

}
