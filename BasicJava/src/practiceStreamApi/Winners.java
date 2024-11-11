package practiceStreamApi;

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
		
		System.out.println("--get the normal list--");
		
		System.out.println("list = "+list);
		
		System.out.println("----get the phone numbers and names----");
		
		list.stream().map(e -> e.name+"  "+e.phoneNo).forEach(System.out::println);
		
		System.out.println("----get the valid phone numbers----");
		
		list.stream().map(e -> e.phoneNo).filter(e ->e.length()==10).forEach(System.out::println);
		
		System.out.println("----remove duplicate contestant----");
		
		list.stream().map(e -> e.name+"  "+e.phoneNo).distinct().forEach(System.out::println);
		
		System.out.println("----shuffle contestant----");
		
		list.stream().map(e -> e.name+"  "+e.phoneNo).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
			Collections.shuffle(e);
			return e.stream();
		})).forEach(System.out::println);

		System.out.println("----get 3 winners----");
		
		list.stream().map(e -> e.name+"  "+e.phoneNo).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
			Collections.shuffle(e);
			return e.stream();
		})).limit(3).forEach(System.out::println);
		
		System.out.println("----get Winner----");
		
		list.stream().map(e -> e.name+"  "+e.phoneNo).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
			Collections.shuffle(e);
			return e.stream();
		})).limit(1).forEach(System.out::println);
		
	}

}
