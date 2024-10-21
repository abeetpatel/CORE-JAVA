package abeet.patel.exeception;

public class Locker {
	
	public static void main(String[] args) {
		
		int password = 142536;
		
		if ( password != 142536) {
			
			try {
				
				throw new AccessDeniedException("Access Denied..");
				
			}catch(AccessDeniedException e) {
				
				System.out.println(e.getMessage());
				
			}
				
			}else {
				
				System.out.println("Access is successful..");
			
		}
		
	}

}
