package abeet.patel.serializable;

import java.io.Serializable;

public class Employee implements Serializable{
	
	public String name;
	public int id;
	
	public Employee(String n, int id) {
		
		this.name = n;
		this.id = id;
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

}
