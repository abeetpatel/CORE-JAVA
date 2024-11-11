package practiceIO.serializable;

import java.io.Serializable;

public class Employee implements Serializable{
	
	public String name;
	
	public String id;
	
	public Employee(String n, String id) {
		
		this.name = n;
		
		this.id = id;
		
	}

	@Override
	public String toString() {
		return "name = " + name + ", id = " + id ;
	}
	
}
