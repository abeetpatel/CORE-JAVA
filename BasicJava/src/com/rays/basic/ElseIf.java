package com.rays.basic;

public class ElseIf {

	public static void main(String[] args) {
		
		String id = "abeet";
		String password = "123";
		if( id == null && password == null) {
			System.out.println(" ID or Passsword is empty");
		}else if ( id != "abeet" && password == "123") {
			System.out.println(" ID is incorrect");
		}else if ( id == "abeet" && password != "123") {
			System.out.println(" Password is incorrect");
		}else {
			System.out.println(" Login process is done....");
		}

	}

}
