package abeet.patel.io.serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {
	
	public static void main(String[] args) throws Exception {
		
		Employee e = new Employee("yash", 20);
		
		//serialization;
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//yash.txt"));
		
		out.writeObject(e);
		
		System.out.println("Object serialization succefully....");
		
		out.close();
		
		//Deserialization;
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//yash.txt"));
		
		e = (Employee) in.readObject();
		
		System.out.println(e);
		
		in.close();
		
	}

}
