package com.rays.javaoop.dataabstraction;

public class Businessman implements Richman {

	@Override
	public void earnMoney() {
	
		System.out.println("eran money");
		
	}

	@Override
	public void donation() {
	
		System.out.println("give donation");
		
	}

	@Override
	public void party() {
		
		System.out.println("party.......");
		
	}

}
