package abeet.patel.basic;

public class SwitchCase {
	public static void main(String[] args) {
		
		String month = "Feb";
		switch (month) {
		case "Jan":
			System.out.println(" this is first month");
			break;
		case "Feb":
			System.out.println(" this is second month");
			break;
		case "Mar":
			System.out.println(" this is third month ");

		default:
			System.out.println(" this month is default");
			break;
		}
				
	}

}
