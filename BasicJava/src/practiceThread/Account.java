package practiceThread;

public class Account {
	
	public double balance;
	
	public String name;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public void deposite ( String name ,double amt) {
		
		this.name = name;
		
		this.balance = balance + amt ;
		
		System.out.println(name+ " = " +balance);
		
	}

}
