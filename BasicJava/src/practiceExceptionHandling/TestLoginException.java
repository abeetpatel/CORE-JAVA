package practiceExceptionHandling;

import java.util.Scanner;

public class TestLoginException {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your password..");
		
		String id = "Abeet";
		
		int pass = sc.nextInt();
		
		if ( pass != 123) {
			
			try {
				
				throw new LoginException("Password is incorrect...");
			
			} catch (LoginException e) {
			
				System.out.println(e.getMessage());
			
			}
			
		}else {
			
			System.out.println("Login process is done..");
			
		}
		
	}

}
