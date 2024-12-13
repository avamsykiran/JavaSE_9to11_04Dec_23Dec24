package com.cts.jsedemo.models;

import java.util.Objects;

public class Employee {

	private int empId;
	private String fullName;
	private double salary;
	private double hra;
	
	public Employee() {
		//left blank
	}

	public Employee(int empId, String fullName, double salary, double hra) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.salary = salary;
		this.hra = hra;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}
	
	public double getGrossPay() {
		return this.salary+this.hra;
	}
	
	public final double getNetPay() {
		double tax = this.getGrossPay() * 0.10;
		return this.getGrossPay() - tax;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, fullName, hra, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(fullName, other.fullName)
				&& Double.doubleToLongBits(hra) == Double.doubleToLongBits(other.hra)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "empId=" + empId + ", fullName=" + fullName + ", salary=" + salary + ", hra=" + hra
				+ ", GrossPay=" + getGrossPay() + ", NetPay="+getNetPay();
	}
	
	
}
