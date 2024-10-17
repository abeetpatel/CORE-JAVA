package abeet.patel.javaoop;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a = new Account ();
		
		a.setNumber("123456");
		a.setAccountType("Saving");
		a.setBalance(500.0);
		
		System.out.println("Account number = "+a.getNumber());
		System.out.println("Account type = "+a.getAccountType());
		System.out.println("Account balance = "+a.getBalance());
		
		a.deposit(250);
		
		System.out.println("Account balance after deposite = "+a.getBalance());
		
		a.withdrawal(50);
		
		System.out.println("Account balance after withdrawal = "+a.getBalance());
		
		a.fundTransfer(200);
		
		System.out.println("Account balance after fund transfer = "+a.getBalance());
		
		a.payBill(250);
		
		System.out.println("Account balance after paybill = "+a.getBalance());
		
		
	}

}
