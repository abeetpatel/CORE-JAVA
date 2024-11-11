package practice;

public class ConsonentsCount {
	
	public static void main(String[] args) {
		
		String name = "abeet patel";
		
		int count = 0;
		
		for (int i = 0; i < name.length(); i++) {
			
			char ch = name.charAt(i);
			
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				
				count++;
				
			}
			
		}
		
		System.out.println("Number of Consonents available in the Name = "+(name.length() - (count + 1 )));
		
	}

}
