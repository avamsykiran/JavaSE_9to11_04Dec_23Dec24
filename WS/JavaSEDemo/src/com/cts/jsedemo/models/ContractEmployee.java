package com.cts.jsedemo.models;

import java.util.Objects;

public class ContractEmployee extends Employee {

	private int contractDuration;
	
	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(int empId, String fullName, double salary, double hra,int contractDuration) {
		super(empId, fullName, salary, hra);
		this.contractDuration=contractDuration;
	}

	public int getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(int contractDuration) {
		this.contractDuration = contractDuration;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(contractDuration);
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
		ContractEmployee other = (ContractEmployee) obj;
		return contractDuration == other.contractDuration;
	}

	@Override
	public String toString() {
		return super.toString() + ", contractDuration=" + contractDuration;
	}
	
}
