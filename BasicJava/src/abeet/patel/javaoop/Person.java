package abeet.patel.javaoop;

import java.util.Date;

public class Person {
	
	private String name;
	
	private int dob;
	
	private String address;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setDob( int dob) {
		this.dob = dob;
	}
	
	public int getDob() {
		return this.dob;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}
	 public int getAge(int dob) {
		 return (2024- dob);
	 }
	
	

}
