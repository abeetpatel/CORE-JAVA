package abeet.patel.javaoop;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setName("abeet");
		p.setDob(2001);
		p.setAddress("jabalpur");
		
		System.out.println("Name = "+p.getName());
		System.out.println("DOB = "+p.getDob());
		System.out.println("Address = "+p.getAddress());
		System.out.println("Age = "+p.getAge(p.getDob()));
		
	}

}
