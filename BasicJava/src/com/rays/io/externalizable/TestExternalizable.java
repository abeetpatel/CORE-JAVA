package com.rays.io.externalizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalizable {

	public static void main(String[] args) throws Exception {

		Employee e = new Employee("Aman", 1);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//emp.txt"));

		out.writeObject(e);

		System.out.println("successfully..");

		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//emp.txt"));

		e = (Employee) in.readObject();

		System.out.println(e);

		in.close();
	}

}
