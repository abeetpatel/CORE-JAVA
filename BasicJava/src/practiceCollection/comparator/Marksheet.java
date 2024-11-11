package practiceCollection.comparator;

public class Marksheet {
	
	public String rollNo;
	public String name;
	public  int maths;
	public int chemistry;
	public int physics;
	
	 public Marksheet(String rollNo, String name, int maths, int che, int phy) {
		
		 this.rollNo = rollNo;
		 this.name = name;
		 this.maths = maths;
		 this.chemistry = che;
		 this.physics = phy;
		 
	}

	@Override
	public String toString() {
		return "Marksheet [rollNo=" + rollNo + ", name=" + name + ", maths=" + maths + ", chemistry=" + chemistry
				+ ", physics=" + physics + "]";
	}

}
