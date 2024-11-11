package practiceExceptionHandling;

import java.util.Scanner;

public class TestDuplicateRecordException {
	
	public static void main(String[] args) {
		
		String name = "pooja";
		
		String name1 = "amit";
		
		String name2 = "pooja";
		
		String name3 = "yash";
		
		if(name == name1 ||name1 == name2 ||name3 == name1 ||name2 == name3 ||name2 == name ||name == name3) {
			
			try {
			
			throw new DuplicateRecordException("Duplicate records occurs..");
			
			}catch(DuplicateRecordException e) {
				
				System.out.println(e.getMessage());
				
			}
			
		}else {
			
			System.out.println("records are perfect...");
			
		}
		
	}

}
