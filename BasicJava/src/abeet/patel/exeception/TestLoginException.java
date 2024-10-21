package abeet.patel.exeception;

public class TestLoginException {
	
	public static void main(String[] args) {
		
		String loginID = "abeet";
		
		if (loginID != "abeet") {
			
			try {
				
				throw new LoginException("Login ID is invalid...");
				
			}catch(LoginException e) {
				
				System.out.println("Catch Block..");
				
			}
			
		}
		
	}

}
