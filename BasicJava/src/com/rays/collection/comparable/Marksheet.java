package com.rays.collection.comparable;

public class Marksheet implements Comparable<Marksheet> {

	private String rollNo;
	private String name;
	private int physics;
	private int chemistry;
	private int maths;

	public Marksheet(String rollNo, String name, int phy, int chm, int maths) {

		this.rollNo = rollNo;
		this.name = name;
		this.physics = phy;
		this.chemistry = chm;
		this.maths = maths;

	}

	@Override
	public int compareTo(Marksheet o) {

		//return this.name.compareTo(o.name);
		return this.physics - o.physics;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name = " + this.name + " rollNo = " + this.rollNo + " phy = " + this.physics + " chm = "
				+ this.chemistry + " maths = " + this.maths;
	}

}
