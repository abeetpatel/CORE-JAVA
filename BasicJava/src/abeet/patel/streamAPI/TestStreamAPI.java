package abeet.patel.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class TestStreamAPI {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("arvind");
		list.add("dharmendra");
		list.add("amit");
		list.add("akhilesh");
		list.add("yash");
		list.add("pooja");
		
		System.out.println("Normal list = "+list);
		
		System.out.println("-----------List sorted by Stream-----------");
		
		list.stream().sorted().forEach(System.out::println);
		
	}

}
