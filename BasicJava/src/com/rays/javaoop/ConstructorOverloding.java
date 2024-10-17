package com.rays.javaoop;

public class ConstructorOverloding {

	private String name;
	private String address;
	private int age;

	public ConstructorOverloding() {

		System.out.println("this is default constructor");

	}

	public ConstructorOverloding(String name) {

		this.name = name;

	}

	public ConstructorOverloding(String name, String address, int age) {

		this.name = name;
		this.address = address;
		this.age = age;

		System.out.println(this.name);
		System.out.println(this.address);
		System.out.println(this.age);

	}

	public ConstructorOverloding(int age, String name, String address) {

		this.name = name;
		this.address = address;
		this.age = age;
		
		System.out.println(this.address );
		System.out.println(this.name);
		System.out.println(this.age);

	}

	public static void main(String[] args) {

		ConstructorOverloding c = new ConstructorOverloding(23, "abeet", "jabalpur");

	}

}
