package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		
		System.out.println("simple date = "+d);

		//Format 1
		
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		
		//Format 2
		
		SimpleDateFormat s = new SimpleDateFormat("yyyy/MM/dd G 'at' hh:mm:ss z");
		
		//Format 3
		
		SimpleDateFormat a = new SimpleDateFormat("hh:mm:ss a dd-MM-yyyy");
		
		System.out.println("Format 1 = "+f.format(d));
		
		System.out.println("Format 2 = "+s.format(d));
		
		System.out.println("Format 3 = "+a.format(d));
		
	}

}
