package abeet.patel.practice;

public class Elseif {
	
	public static void main(String[] args) {
		
		String ID = "abeet";
		
		String pass = "123";
		
		if(  ID == null &&  pass == null) {
			
			System.out.println( "ID and pass both are empty");
			
		}else if ( ID != "abeet" && pass == "123") {
			
			System.out.println("ID is incorrect");
			
		}else if ( ID == "abeet" && pass != "123") {
			
			System.out.println("pass is incorrect");
			
		}else if ( ID != "abeet" && pass != "123") {
			
			System.out.println(" ID and pass both are incorrect");
			
		}
		
		else {
			
			System.out.println(" login process is done");
			
		}
		
	}
	
}

