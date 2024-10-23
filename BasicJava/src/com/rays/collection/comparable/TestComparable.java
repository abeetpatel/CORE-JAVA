package com.rays.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {

		List<Marksheet> list = new ArrayList<Marksheet>();

		list.add(new Marksheet("105", "Baldev", 75, 45, 63));
		list.add(new Marksheet("103", "RamDulera", 45, 65, 72));
		list.add(new Marksheet("102", "Punnet", 54, 54, 63));
		list.add(new Marksheet("101", "Elvish", 25, 15, 36));
		list.add(new Marksheet("104", "Dalaal", 57, 32, 78));

		Collections.sort(list);

		list.forEach(System.out::println);

	}

}
