package practiceCollection.comparable;

public class Marksheet implements Comparable<Marksheet>{
	
	private String rollNo ;
	private String name;
	private int maths;
	private int chemistry;
	private int physics;
	
	public Marksheet(String rollNo, String name, int math, int che, int phy) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.maths = math;
		this.chemistry = che;
		this.physics = phy;
	}

	@Override
	public int compareTo(Marksheet o) {
		//return this.maths - o.maths;
		return this.rollNo.compareTo(rollNo);
	}

	@Override
	public String toString() {
		return "Marksheet [rollNo=" + rollNo + ", name=" + name + ", maths=" + maths + ", chemistry=" + chemistry
				+ ", physics=" + physics + "]";
	}
	
	

}
