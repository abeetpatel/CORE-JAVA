package practiceIO.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {
	
	public static void main(String[] args) throws Exception {
		
		Employee e = new Employee("Ram", "202");
		
		ObjectOutputStream out  = new ObjectOutputStream(new FileOutputStream("D://IO//practicetest.txt"));
		
		out.writeObject(e);
		
		System.out.println("Object seriallized successfully...");
		
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//practicetest.txt"));
		
		e = (Employee) in.readObject();
		
		System.out.println(e);
		
		in.close();
		
	}

}
