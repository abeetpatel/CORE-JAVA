package practiceOOP;

public class ConstructorOverloading {
	
	public String name;
	public String address;
	public int age;
	
	public ConstructorOverloading() {
		
		System.out.println("This is default constructor..");
		
	}
	
	public ConstructorOverloading(String name) {
		
		this.name = name;
		System.out.println(this.name);
		
	}
	
	public ConstructorOverloading(String name, String address) {
		
		this.name = name;
		this.address = address;
		
		System.out.println(this.name);
		System.out.println(this.address);
		
	}
	
	public ConstructorOverloading(String address,String name,int age) {
		
		this.name = name;
		this.address = address;
		this.age = age;
		
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.age);	
		
	}
	
	public ConstructorOverloading(int age,String name,String address) {
		
		this.name = name;
		this.address = address;
		this.age = age;
		
		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.age);
		
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading c = new ConstructorOverloading(23, "Abeet Patel", "Jabalpur");
		
	}
	

}
