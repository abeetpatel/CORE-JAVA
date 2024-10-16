package abeet.patel.basic;

public class ElseIf {
	public static void main(String[] args) {
		
		String ID = "Abeet";
		String Pass = "123";
		
		if( ID == null && Pass == null) {
			System.out.println(" ID and pass Both are empty");		}
		
		else if ( ID != "Abeet" && Pass == "123") {
			System.out.println(" Your ID is incorrect");
		}
		else if ( ID == "Abeet" && Pass != "123") {
			System.out.println(" Your Pass is incorrect");
		}
		else if ( ID != "Abeet" && Pass != "123") {
			System.out.println(" ID and Pass both are incorrect");
		}else {
			System.out.println(" Login Process Is Done");
		}
		
		
		
	}

}
