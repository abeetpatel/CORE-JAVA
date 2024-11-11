package practiceIO.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable{
	
	public String name;
	
	public transient int id;
	
	public Employee() {
	
	}
	
	public Employee(String n, int id) {
		
		this.name = n;
		
		this.id = id;
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(name);
		
		out.writeInt(id);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		name = (String) in.readObject();
		
		id = in.readInt();
		
	}

	@Override
	public String toString() {
		
		return "name = " + name + ", id = " + id ;
	}

	

}
