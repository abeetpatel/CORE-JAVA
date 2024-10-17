package abeet.patel.inheritance;

public class ConstructerOverloading {
	
	private String name;
	private String address;
	private int age;
	
	public ConstructerOverloading() {
		System.out.println("this is default constructer");
	}
	
	public ConstructerOverloading(String name) {
		this.name = name;
		System.out.println(this.name);
		
	}
	
	public ConstructerOverloading(String name, String address) {
		this.name = name;
		this.address  = address;
		System.out.println(this.name);
		System.out.println(this.address);
		
	}
	
	public ConstructerOverloading(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.age);
		
	}
	
	public static void main(String[] args) {
		
		ConstructerOverloading c = new ConstructerOverloading("abeet", "jabalpur");
		
		
		
	}

}
