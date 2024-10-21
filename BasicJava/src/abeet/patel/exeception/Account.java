package abeet.patel.exeception;

public class Account {
	
	public String userID;
	
	public double balance;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double withrawal( double amt) {
		
		if ( amt > this.balance) {
			
			try {
				
				throw new InsufficientFundException(" Insufficient amount...");
				
			}catch(InsufficientFundException e) {
				
				System.out.println(e.getMessage());
				
			}
			
		}else {
			
			return this.balance = balance - amt;
			
		}return this.balance;
			
	}
	
	

}
