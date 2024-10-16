package com.rays.basic;

public class StringExample {
	
	public static void main(String[] args) {
		
		String name = "Vijay Dinanath Chouhan";
		
		System.out.println("String Lenght = " + name.length());
		System.out.println("8th character is -" + name.charAt(7));
		System.out.println("Dina index is-" + name.indexOf("Dina"));
		System.out.println("first i position -"+name.indexOf("i"));
		System.out.println("Last i postion - " + name.lastIndexOf("i"));
		System.out.println("a is replaced by b - " + name.replace("a"," b"));
		System.out.println("Chota vijay - " + name.toLowerCase());
		System.out.println("Bada vijay - "+ name.toUpperCase());
		System.out.println("Starts with vijay -" + name.startsWith("Vijay"));
		System.out.println("Ends with han -" + name.endsWith("han"));
		System.out.println("Substring - " + name.substring(6));
		
		
	}

}
