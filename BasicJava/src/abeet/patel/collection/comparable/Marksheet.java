package abeet.patel.collection.comparable;

public class Marksheet implements Comparable<Marksheet>  {
	
	private String name;
	private String rollNumber;
	private int physics;
	private int chemistry;
	private int maths;
	
	public Marksheet(String name,String rollNumber,int che, int phy, int maths ) {

		this.name = name;
		this.rollNumber = rollNumber;
		this.chemistry = che;
		this.physics = phy;
		this.maths = maths;
	
	}

	@Override
	public int compareTo(Marksheet o) {
		// return this.maths - o.maths;
		return this.name.compareTo(name);
	}

	@Override
	public String toString() {
		return "Marksheet [name=" + name + ", rollNumber=" + rollNumber + ", physics=" + physics + ", chemistry="
				+ chemistry + ", maths=" + maths + "]";
	}

}
