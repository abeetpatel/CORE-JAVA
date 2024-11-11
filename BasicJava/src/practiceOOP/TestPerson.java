package practiceOOP;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setName("Abeet Patel");
		p.setAddress("Jabalpur..");
		p.setDob("29/08/2001");
		
		System.out.println("Name  = "+p.getName());
		System.out.println("Dob = "+p.getDob());
		System.out.println("Address = "+p.getAddress());
		
	}

}
