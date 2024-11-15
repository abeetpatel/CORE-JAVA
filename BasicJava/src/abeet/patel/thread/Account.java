package abeet.patel.thread;

public class Account {
	
	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public synchronized void deposit(String name, double amt) {
		
		this.balance = balance + amt;
		
		System.out.println("balance after deposit = "+ balance);
		
	}

}
