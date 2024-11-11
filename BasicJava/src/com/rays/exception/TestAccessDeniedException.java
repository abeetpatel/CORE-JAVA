package com.rays.exception;

public class TestAccessDeniedException {
	
	public static void main(String[] args) {
		
		String username = "abeet";
		
		if ( username != "abeet") {
		
		try {
		
		throw new AccessDeniedException("Access Denied");
		
		}catch(AccessDeniedException e) {
			
			System.out.println(e.getMessage());
			
		}
		}else {
			
			System.out.println("Access granted");
			
		}
		
	}

}
