package com.technoelevate.jobportal;

public class Candidate {
	String name;
	long mob;
	double per;
	public Candidate(String name, long mob, double per) {
		super();
		this.name = name;
		this.mob = mob;
		this.per = per;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[name :"+this.name+" , Mobile :"+this.mob+" , Percentage :"+this.per+"]";
	}
}
