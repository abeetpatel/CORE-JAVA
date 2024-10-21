package com.rays.javaoop.dynamicpolymorphism;

public class HomeLoan {
	
	public static void main(String[] args) {
		
		Bank[] bank = new Bank[3];
		
		bank[0] = new AxisBank();
		bank[1] = new HDFCBank();
		bank[2] = new ICICIBank();
		
		loanEnquiry(bank);
		
	}
	
	static void loanEnquiry( Bank[] bank) {
		
		for (Bank b : bank) {
			
			String name = b.getName();
			
			double rate = b.intrestRate();
			
			System.out.println(name+" = "+rate);
			
		}
		
	}

}
