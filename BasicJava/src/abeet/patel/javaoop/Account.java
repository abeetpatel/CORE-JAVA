package abeet.patel.javaoop;

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
	
	public double deposit ( double amt) {
		return this.balance = balance + amt;
	}
	
	public double withdrawal( double amt) {
		return this.balance = balance - amt;
	}
	
	public double fundTransfer(double amt) {
		return this.balance = balance - amt;
	}
	
	public double payBill(double amt) {
		return this.balance = balance - amt;
	}

}
