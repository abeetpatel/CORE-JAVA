package com.rays.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Winners {

	public static void main(String[] args) {

		List<Contestant> list = new ArrayList<Contestant>();

		list.add(new Contestant("Raman", "9885698587"));
		list.add(new Contestant("Shyam", "7859652547"));
		list.add(new Contestant("Raman", "9885698587"));
		list.add(new Contestant("Raman", "9885698587"));
		list.add(new Contestant("Jay", "7856325478"));
		list.add(new Contestant("Pappu", "9114587858"));
		// list.add(new Contestant("gaovala", "5254"));

		System.out.println("get the phone number and name");
		list.stream().map(e -> e.name + " " + e.phone).forEach(System.out::println);

		System.out.println("remove duplicate contestant");
		list.stream().map(e -> e.name + " " + e.phone).distinct().forEach(System.out::println);

		System.out.println("shuffled data");
		list.stream().map(e -> e.name + " " + e.phone).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(System.out::println);

	}

}
