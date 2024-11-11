package practiceStreamApi;

import java.util.ArrayList;
import java.util.List;

public class TestStreamAPI {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Baldev");
		list.add("Ramdulera");
		list.add("Puneet");
		list.add("Taarjan");
		list.add("Tablasingh");
		list.add("Baldev");
		
		System.out.println("----normal list----");
		
		System.out.println("list = "+list);
		
		System.out.println("----list sorted by stream----");
		
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("----list is uppercase----");
		
		list.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
		
		System.out.println("----list is lowercase----");
		
		list.stream().map(e -> e.toLowerCase()).forEach(System.out::println);
		
		System.out.println("----remove duplicate element----");
		
		list.stream().distinct().forEach(System.out::println);
		
		System.out.println("----start with T----");
		
		list.stream().filter(e -> e.startsWith("T")).forEach(System.out::println);
		
	}

}
