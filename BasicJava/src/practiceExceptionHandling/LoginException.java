package practiceExceptionHandling;

public class LoginException extends Exception{
	
	public LoginException(String msg) {
		
		System.out.println(msg);
		
	}

}
