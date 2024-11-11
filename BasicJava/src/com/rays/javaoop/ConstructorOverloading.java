package com.rays.javaoop;

public class ConstructorOverloading {

	private String name;
	private String address;
	private int age;

	public ConstructorOverloading() {

		System.out.println("this is default constructor");

	}

	public ConstructorOverloading(String name) {

		this.name = name;

	}

	public ConstructorOverloading(String name, String address, int age) {

		this.name = name;
		this.address = address;
		this.age = age;

		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.age);

	}

	public ConstructorOverloading(int age, String name, String address) {

		this.name = name;
		this.address = address;
		this.age = age;
		
		System.out.println(this.address );
		System.out.println(this.name);
		System.out.println(this.age);

	}

	public static void main(String[] args) {

		ConstructorOverloading c = new ConstructorOverloading(23, "abeet", "jabalpur");

	}

}
