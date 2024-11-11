package com.rays.exception;

public class TestDuplicateRecordException {
	
	public static void main(String[] args) {
		
		String name = "yash";
		
		String name1 = "amit";
		
		String name2 = "yash";
		
		if( name == name1 || name == name2 || name1 == name2) {
			
			try {
				
				throw new DuplicateRecordException("Duplicate Records");
				
			} catch (DuplicateRecordException e) {
				
				System.out.println(e.getMessage());
				
			}
		}
		
	}
			
}
