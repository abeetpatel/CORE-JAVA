package com.rays.exception;

public class Account {

	private String number;

	private String accountType;

	private double balance;

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return this.number;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	public double withdrawal(double amt) {

		if (amt > this.balance) {

			try {
				throw new InsufficientFundException("Insufficient Balance..");
			} catch (InsufficientFundException e) {
				System.out.println(e.getMessage());
			}

		} else {

			return this.balance = balance - amt;
		}
		return this.balance;
	}

}
