package abeet.patel.collection.comparator;

import java.util.Comparator;

public class Marksheet {
	
	public String rollNo;
	public String name;
	public int physics;
	public int chemistry;
	public int maths;
	
	public Marksheet(String name, String rollNo, int phy, int che, int maths) {
		
		this.name = name;
		this.rollNo = rollNo;
		this.physics = phy;
		this.chemistry = che;
		this.maths = maths;
		
	}

	@Override
	public String toString() {
		return "Marksheet [rollNo=" + rollNo + ", name=" + name + ", physics=" + physics + ", chemistry=" + chemistry
				+ ", maths=" + maths + "]";
	}

	

}
