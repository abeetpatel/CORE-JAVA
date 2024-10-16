package com.rays.javaoop;

public class Account {

	public String number;
	public String type;
	public double balance;

	public void setNumber(String number) {
		this.number = number;

	}

	public String getNumber() {
		return this.number;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;

	}

	public double deposit(double amt) {

		return this.balance = balance + amt;

	}

	public double withdrwal(double amt) {

		return this.balance = balance - amt;

	}

}
