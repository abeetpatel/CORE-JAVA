package practiceExceptionHandling;

import java.util.Scanner;

public class TestInsufficientFundException {
	
	private double balance = 500.0;
	
	public void withdrawal(double amt) {
		
		if ( amt > this.balance) {
			
			try {
			
			throw new InsufficientFundException("Insufficient balance...");
			
			}catch(InsufficientFundException e) {
				
				System.out.println(e.getMessage());
				
			}
		}else {
			
			this.balance = balance - amt ;
		
			System.out.println("Balance after withdrawal = "+balance);
			
		}
		
	}	
	
	public static void main(String[] args) {
		
		TestInsufficientFundException a = new TestInsufficientFundException();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your amount...");
		
		a.withdrawal(sc.nextDouble());
		
	}

}
