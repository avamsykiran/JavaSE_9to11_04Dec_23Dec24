package com.cts.jsedemo.models;

import java.util.Objects;

public class Director extends Manager {

	private double share;
	
	public Director() {
		// TODO Auto-generated constructor stub
	}

	public Director(int empId, String fullName, double salary, double hra, int ta,double share) {
		super(empId, fullName, salary, hra, ta);
		this.share=share;
	}

	public double getShare() {
		return share;
	}

	public void setShare(double share) {
		this.share = share;
	}
	
	@Override
	public double getGrossPay() {
		return super.getGrossPay() + share;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(share);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Director other = (Director) obj;
		return Double.doubleToLongBits(share) == Double.doubleToLongBits(other.share);
	}

	@Override
	public String toString() {
		return super.toString() + ", share=" + share;
	}

	
}
