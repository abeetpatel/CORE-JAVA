package com.rays.javaoop;

public class Testaccount {
	public static void main(String[] args) {

		Account a1 = new Account();

		a1.setNumber("165542");
		a1.setType("Saving");
		a1.setBalance(100);

		System.out.println(a1.getNumber());
		System.out.println(a1.getType());
		System.out.println("current balance = " + a1.getBalance());

		a1.deposit(150.0);

		System.out.println("total balance after deposite = " + a1.getBalance());

		a1.withdrwal(50);

		System.out.println("total balance after withdrwal = " + a1.getBalance());

	}
}
