package com.cts.jsedemo.models;

import java.util.Objects;

public class Manager extends Employee {

	private int ta;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(int empId, String fullName, double salary, double hra,int ta) {
		super(empId, fullName, salary, hra);
		this.ta=ta;
	}

	public int getTa() {
		return ta;
	}

	public void setTa(int ta) {
		this.ta = ta;
	}
	
	@Override
	public double getGrossPay() {
		return super.getGrossPay() + ta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(ta);
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
		Manager other = (Manager) obj;
		return ta == other.ta;
	}

	@Override
	public String toString() {
		return super.toString() + ", ta=" + ta;
	}

		
}
