package practice;

public class VowelsCount {
	
	public static void main(String[] args) {
		
		String name = "abeet patel";
		
		int count = 0;
		
		for (int i = 0; i < name.length(); i++) {
			
			char ch = name.charAt(i);
			
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				
				count++;
				
			}
			
			if( "aeiouAEIOU".indexOf(ch) != -1) {
				
				System.out.println(ch);
				
			}
			
		}
		
		System.out.println("Number of Vowels available in the Name = "+count);
		
	}

}
