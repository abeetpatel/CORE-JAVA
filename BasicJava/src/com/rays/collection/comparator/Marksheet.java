package com.rays.collection.comparator;

public class Marksheet {

	public String rollNo;
	public String name;
	public int physics;
	public int chemistry;
	public int maths;

	public Marksheet(String rollNo, String name, int phy, int chm, int maths) {

		this.rollNo = rollNo;
		this.name = name;
		this.physics = phy;
		this.chemistry = chm;
		this.maths = maths;

	}

	@Override
	public String toString() {
		return "rollNo=" + rollNo + ", name=" + name + ", physics=" + physics + ", chemistry=" + chemistry + ", maths="
				+ maths + "";
	}

}
