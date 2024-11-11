package practiceOOP;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setBalance(1000.0);
		a.setAccountType("Saving..");
		a.setNumber("123456");
		
		System.out.println("Account Balance = "+a.getBalance());
		System.out.println("Account Type = "+a.getAccountType());
		System.out.println("Account Number = "+a.getNumber());
		
		a.deposit(250);
		System.out.println("Balance after Deposit = "+a.getBalance());
		
		a.withdrawal(100);
		System.out.println("Balance after Withdrawal = "+a.getBalance());
		
		a.fundTransfer(500);
		System.out.println("Balance after Fundtransfer = "+a.getBalance());
		
		a.paybill(250);
		System.out.println("Balance after Paybill = "+a.getBalance());
		
	}

}
