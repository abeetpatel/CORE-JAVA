package com.rays.io.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {

	public static void main(String[] args) throws Exception {

		Employee e = new Employee("Ram", 1);

		// serialization
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//testemp.txt"));

		out.writeObject(e);

		System.out.println("obj serialization successfully..");

		out.close();

		// deserialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//testemp.txt"));

		e = (Employee) in.readObject();

		System.out.println(e);

		in.close();
	}

}
