package com.rays.thread;

public class Account {

	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(String name, double amt) {

		synchronized (name) {

			this.balance = this.balance + amt;

			System.out.println(name + " = " + this.balance);

		}

	}

}
