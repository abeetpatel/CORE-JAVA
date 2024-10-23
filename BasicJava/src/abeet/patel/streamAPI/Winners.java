package abeet.patel.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Winners {
	
	public static void main(String[] args) {
		
		List<Contestant> list = new ArrayList<Contestant>();
		
		list.add( new Contestant("Arvind", "5465448452"));
		list.add( new Contestant("Dharmendra", "4654865457"));
		list.add( new Contestant("Amit", "545465464284"));
		list.add( new Contestant("Akhilesh", "5546546558"));
		list.add( new Contestant("Yash", "5468451545"));
		list.add( new Contestant("Amit", "545465464284"));
//		list.add( new Contestant("Pooja", "741"));
		
		System.out.println("-----Normal List-------");
		
		System.out.println(list);
		
		System.out.println("------Get the name and phone no.------");
		
		list.stream().map(e -> e.name+"  "+e.phone).forEach(System.out::println);
		
//		System.out.println("--------Get the valid phone number--------");
		
//		list.stream().map(e -> e.phone).filter(e -> e.length()== 10).forEach(System.out::println);
		
		System.out.println("---------Remove duplicate elements--------");
		
		list.stream().map(e -> e.name +"   "+e.phone).distinct().forEach(System.out::println);
		
		System.out.println("-------Suffle Elememnts--------");
		
		list.stream().map(e -> e.name +"   "+e.phone).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
			Collections.shuffle(e);
			return e.stream();
		})).forEach(System.out::println);
		
		System.out.println("---------Get any 3 winners---------");
		
		list.stream().map(e -> e.name + "  "+ e.phone).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
		Collections.shuffle(e);
		return e.stream();
		})).limit(3).forEach(System.out::println);
		
		System.out.println("-----------Get only one winner---------");
		
		list.stream().map(e -> e.name + "   " + e.phone).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
			Collections.shuffle(e);
			return e.stream();
		
		})).limit(1).forEach(System.out::println);
	}

}
