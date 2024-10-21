package abeet.patel.exeception;

public class TestExeception {
	
	public static void main(String[] args) {
		
		int a = 5;
		
		try {
		int i = a / 0;
		
		System.out.println(i);
		
		}catch(Exception e) {
			
			System.out.println("catch block..");
			
		}finally {
			
			System.out.println(a/5);
			
		}
		
		//System.out.println("Login completed..");
		
		
	}
	
}
