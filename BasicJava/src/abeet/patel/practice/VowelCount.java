 package abeet.patel.practice;

public class VowelCount {
	
	public static void main(String[] args) {
		
		String str = "abeetpatel";
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				
				count++;
				
			}if ( "aeiouAEIOU".indexOf(ch) != -1) {
				
				System.out.println(ch);
				
			}
			
		}System.out.println("counting of vowels = "+count);
		
	}

}
