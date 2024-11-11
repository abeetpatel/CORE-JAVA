package practice;

public class CountAccuraceOfChar {
	
	public static void main(String[] args) {
		
		String name = "abeetpatel";
		
		int count = 0;
		
		for (int i = 0; i < name.length(); i++) {
			
			char ch = name.charAt(i);
			
			String str = String.valueOf(ch);
			
			if ( str.matches("e")) {
				
				count++;
				
			}
			
		}System.out.println(" e : "+count);
		
	}

}
