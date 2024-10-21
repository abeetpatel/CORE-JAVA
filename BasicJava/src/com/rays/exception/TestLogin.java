package com.rays.exception;

public class TestLogin {

	public static void main(String[] args) {

		String loginId = "abc";

		if (loginId != "abc") {

			try {
			
				throw new LoginException("login id is invalid..");
			
			} catch (LoginException e) {
				
				System.out.println(e.getMessage());
				
			}

		} else {
			System.out.println("login successfully..");
		}

	}

}
