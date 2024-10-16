package abeet.patel.practice;

public class Elseif {
	
	public static void main(String[] args) {
		
		String ID = "Abeet Patel";
		
		String Password = "123";
		
		if ( ID == null && Password == null) {
			
			System.out.println(" ID and Password is empty ");
							
			}else if ( ID != "Abeet Patel" && Password == "123") {
				
				System.out.println(" ID is incorrect");
			
		}else if ( ID == "Abeet Patel" && Password != "123") {
			
			System.out.println(" Password is incorrect");
			
		}else if ( ID != "Abeet Patel" && Password != "123") {
			
			System.out.println( " ID & Password both are incorrect ");
			
		}else {
			
			System.out.println(" Login Process is done ");
			
		}
		
	}

}
