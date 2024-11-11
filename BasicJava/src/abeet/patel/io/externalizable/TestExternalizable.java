package abeet.patel.io.externalizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalizable {
	
	public static void main(String[] args) throws Exception {
		
		Employee e = new Employee("amit",25);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//amit.txt"));
		
		out.writeObject(e);
		
		System.out.println("Successfully....");
		
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//amit.txt"));
		
		e = (Employee) in.readObject();
		
		System.out.println(e);
		
		in.close();
		
	}

}
