package abeet.patel.basic;

public class CountAccuraceOfaChar {
	
	public static void main(String[] args) {
		
		String name = "abeetpatel";
		
		int count = 0;
		
		for (int i = 0; i < name.length(); i++) {
			
			char ch = name.charAt(i);
			
			String m = String.valueOf(ch);
			
			if ( m.matches("e")) {
				
				count++;
				
			}
			
		}System.out.println(" e : "+count);
		
	}
	
}
