package practiceOOP;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	
	private String name;
	private String dob;
	private String address;
	public int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
