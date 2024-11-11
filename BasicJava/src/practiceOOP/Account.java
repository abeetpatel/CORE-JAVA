package practiceOOP;

public class Account{
	
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
	
	public void deposit(double amt) {
		
		this.balance = balance + amt ;
		
	}
	
	public void withdrawal(double amt) {
		
		this.balance = balance - amt ;
		
	}
	
	public void fundTransfer(double amt) {
		
		this.balance = balance - amt;
		
	}
	
	public void paybill(double amt) {
		
		this.balance = balance - amt;
		
	}

}
